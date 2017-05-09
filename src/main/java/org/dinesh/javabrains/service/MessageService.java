package org.dinesh.javabrains.service;

import org.dinesh.javabrains.database.DatabaseClass;

import org.dinesh.javabrains.model.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by LocalHost on 5/8/17.
 */
public class MessageService {

    private Map<Long,Message> messages = DatabaseClass.getMessages();

    public MessageService(){
        messages.put(1L,new Message(1,"Hello World!","Dinesh"));
        messages.put(2L,new Message(2,"Hello World Again","Singh"));

    }
    public List<Message> getAllMessages(){
        return new ArrayList<Message>(messages.values());
    }

    public Message getMessage(long id){
        return messages.get(id);
    }

    public Message addMessage(Message message){
        message.setId(messages.size()+1);
        messages.put(message.getId(),message);
        return message;
    }

    public Message updateMessage(Message message){
        if(message.getId()<=0){
            return null;
        }
        messages.put(message.getId(),message);
        return message;
    }

    public Message removeMessage(long id){
        return messages.remove(id);
    }
/*
    public List<Message> getAllMessages(){
        Message m1 = new Message(1L,"Hello World!","dinesh");
        Message m2 = new Message(2L,"Hello Jersey!","singh");
        List<Message> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        return list;

        // usually messages are derived from database, but for simplicty we are just creating messages.
    }
*/


}
