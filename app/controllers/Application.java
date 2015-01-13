package controllers;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import models.Bar;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.showDir;

import java.util.ArrayList;

import static play.data.Form.form;

public class Application extends Controller {
    static ArrayList<String> name;
    static ArrayList<Long> size;
    public static Result index() {
        return ok(index.render(null));
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
            String accessKey = bar.access;
            String secretKey = bar.secret;
            String bucketName = bar.bucketName;
            ClientConfiguration clientConfig = new ClientConfiguration();
            clientConfig.setProtocol(Protocol.HTTPS);
            clientConfig.setProxyHost("10.3.100.207");
            clientConfig.setProxyPort(8080);
            AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
            AmazonS3 conn = new AmazonS3Client(credentials, clientConfig);


//            System.out.println("Connection setup done");
//            File file = new File("/home/rupesh/a");
//            PutObjectRequest putObject = new PutObjectRequest(bucketName, "tryPut", file);
//            ObjectMetadata metaData = new ObjectMetadata();
//            metaData.setContentType("application/pdf"); //binary data
//            putObject.setMetadata(metaData);
//            conn.putObject(putObject);
//
//            System.out.println("folder uploaded");
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

//

}
