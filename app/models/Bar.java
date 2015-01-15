package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.awt.*;

/**
 * Created by rupesh on 8/1/15.
 */
@Entity
public class Bar extends Model {
    @Id
    public  String id;
    public String access;
    public String secret;
    public String bucketName;
    public Checkbox checkbox;
    public String ip;
    public int port;
}
