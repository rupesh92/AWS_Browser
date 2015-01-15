package controllers;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.*;
import models.Bar;
import models.FileContent;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.showDir;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;

import static play.data.Form.form;

public class Application extends Controller {
    static ArrayList<String> name;
    static ArrayList<Long> size;
    static  String accessKey,secretKey,bucketName;
    static  Checkbox checkBox;
    static  AmazonS3 conn;

    public static Result index() {
        return ok(index.render(null));
    }

    public static Result uploadFile() {
            Form<FileContent> userForm = form(FileContent.class).bindFromRequest();
            if (!userForm.hasErrors()) {
                FileContent files = userForm.get();
                files.save();
                File file = (files.uploadfile);
                System.out.println("file uploaded with a name : "+ file.getName());

                PutObjectRequest putObject = new PutObjectRequest(bucketName, file.getName(), file);

                conn.putObject(putObject);
            }

        return redirect(routes.Application.showDir());
    }

    public static Result showDir() {
        return ok(showDir.render(name));
    }
    public static Result check() {
        Form<Bar> userForm = form(Bar.class).bindFromRequest();
        name = new ArrayList<String>();
        size = new ArrayList<Long>();
        if (!userForm.hasErrors()) {
            Bar bar = userForm.get();
            bar.save();
            accessKey = bar.access;
            secretKey = bar.secret;
            bucketName = bar.bucketName;
            checkBox = bar.checkbox;
            AmazonS3 conn = setUpConnection(bar);
            ListObjectsRequest listObjectsRequest = new ListObjectsRequest()
                    .withBucketName(bucketName);

            ObjectListing objectListing;

            do {
                objectListing = conn.listObjects(listObjectsRequest);
                for (S3ObjectSummary objectSummary :
                        objectListing.getObjectSummaries()) {
                    name.add(objectSummary.getKey());
                    size.add(objectSummary.getSize());
                }
                listObjectsRequest.setMarker(objectListing.getNextMarker());
            } while (objectListing.isTruncated());
        }
        else System.out.println("Error fetching data from the form");
        return redirect(routes.Application.showDir());
    }


    public static AmazonS3 setUpConnection(Bar bar){

            if(!checkBox.getState()){
                ClientConfiguration clientConfig = new ClientConfiguration();
                clientConfig.setProtocol(Protocol.HTTPS);
                clientConfig.setProxyHost(bar.ip);
                clientConfig.setProxyPort(bar.port);
                AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
                conn = new AmazonS3Client(credentials, clientConfig);

            }
            else{
                AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
                conn = new AmazonS3Client(credentials);
            }
            return conn;
        }
}
