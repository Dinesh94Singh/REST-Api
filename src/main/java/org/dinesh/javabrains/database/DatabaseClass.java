package org.dinesh.javabrains.database;

import org.dinesh.javabrains.model.Message;
import org.dinesh.javabrains.model.Profile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LocalHost on 5/8/17.
 */
public class DatabaseClass {
    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String,Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages(){
        return messages;
    }
    public static Map<String, Profile> getProfiles(){
        return profiles;
    }
}
