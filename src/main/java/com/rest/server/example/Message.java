package com.rest.server.example;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by cly on 15/7/28.
 */
@Component
@XmlRootElement
public class Message {
    private String content;
    public String getContent() {
        return content;
    }

    public void setContent(String name) {
        this.content = "hello "+name;
    }


}
