package org.dinesh.javabrains.Resources;

import org.dinesh.javabrains.model.Profile;
import org.dinesh.javabrains.service.ProfileService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


/**
 * Created by LocalHost on 5/8/17.
 */

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

    private ProfileService profileService = new ProfileService();


    @GET
    public List<Profile> getProfiles(){
        return profileService.getAllProfiles();
    }

    @POST
    public Profile addProfile(Profile profile){
        return profileService.addProfile(profile);
    }

    @GET
    @Path("/{profileName}")
    public Profile getProfile(@PathParam("profileName") String profileName){
        return profileService.getProfile(profileName);
    }

    @PUT
    @Path("/{profileName}")
    public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile){
        profile.setProfileName(profileName);
        return profileService.updateProfile(profile);
    }

    @DELETE
    @Path("/{profileName}")
    public Profile deleteProfile(@PathParam("profileName") String profileName){
        return profileService.removeProfile(profileName);
    }
}
