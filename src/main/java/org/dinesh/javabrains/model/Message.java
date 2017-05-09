package org.dinesh.javabrains.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;


/**
 * Created by LocalHost on 5/8/17.
 */
@XmlRootElement
public class Message {

    private long id;
    private String message;
    private Date created;
    private String author;
// this could be a hibernate class.
    public Message(){
        // my default constructor
    }
    public Message(long id, String message, String author) {
        this.id = id;
        this.message = message;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
