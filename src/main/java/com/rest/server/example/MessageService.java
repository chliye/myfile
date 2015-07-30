package com.rest.server.example;

import org.springframework.stereotype.Component;

/**
 * Created by cly on 15/7/28.
 */

@Component
public class MessageService {

    private Message message;

    public Message geneService(String name){
        message = new Message();
        message.setContent(name);
        return  message;
    }
}
