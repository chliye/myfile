package com.rest.server.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


/**
 * Created by cly on 15/7/28.
 */
@Path("messages")
@Component
public class MessageResource {

    @Autowired
    private MessageService messageService;

    @POST
    @Path("/name/{name}")
    @Produces(MediaType.APPLICATION_JSON)

    public Message getService(@PathParam("name") String name){
        Message m = messageService.geneService(name);
        System.out.println(m.getContent());
        return m;
    }

    

}
