package org.dinesh.javabrains.Resources;

import org.dinesh.javabrains.model.Message;
import org.dinesh.javabrains.service.MessageService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


/**
 * Created by LocalHost on 5/8/17.
 */
@Path("/messages")
public class MessageResource {

    MessageService messageService = new MessageService();
    // GET and Post will specify the incoming request from client
    // Produces specifies the Return type from server to client.
    @GET
    //@Produces(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessage(){
        return messageService.getAllMessages();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message addMessage(Message message){
        return messageService.addMessage(message);
    }

    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("messageId") long id){
        // automatically the integer is converted into long
        // pathparam will specify only to consider that particular path in URI
        return messageService.getMessage(id);
    }

    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMessage(@PathParam("messageId") long id){
        messageService.removeMessage(id);
    }


    @PUT
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message updateMessage(@PathParam("messageId") long id, Message message){
        message.setId(id);
        return messageService.updateMessage(message);
    }
}
