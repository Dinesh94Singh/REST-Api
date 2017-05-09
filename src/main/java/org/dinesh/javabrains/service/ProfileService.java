package org.dinesh.javabrains.service;

import org.dinesh.javabrains.database.DatabaseClass;
import org.dinesh.javabrains.model.Message;
import org.dinesh.javabrains.model.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by LocalHost on 5/8/17.
 */
public class ProfileService {

    public Map<String, Profile> profiles = DatabaseClass.getProfiles();

    public ProfileService(){
        profiles.put("Dinesh",new Profile(1L,"Dinesh","Singh","DineshSingh"));
    }
    public List<Profile> getAllProfiles(){
        return new ArrayList<Profile>(profiles.values());
    }

    public Profile getProfile(String profileName){
        return profiles.get(profileName);
    }

    public Profile addProfile(Profile profile){
        profile.setId(profiles.size()+1);
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }

    public Profile updateProfile(Profile profile){
        if(profile.getProfileName().isEmpty()){
            return null;
        }
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }
    public Profile removeProfile(String profileName){
        return profiles.remove(profileName);
    }
}
