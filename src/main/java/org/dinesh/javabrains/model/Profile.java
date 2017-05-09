package org.dinesh.javabrains.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by LocalHost on 5/8/17.
 */
@XmlRootElement
public class Profile {

    long id;
    String firstName;
    String lastName;
    String profileName;

    public Profile(){
        // default constructor
    }
    public Profile(long id, String firstName, String lastName,String profileName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profileName = profileName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfileName(){
        return this.profileName;
    }

    public void setProfileName(String profileName){
        this.profileName = profileName;
    }
}
