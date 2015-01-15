package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.File;

/**
 * Created by rupesh on 15/1/15.
 */
@Entity
public class FileContent extends Model {
    @Id
    public String id;
    public File uploadfile;
}