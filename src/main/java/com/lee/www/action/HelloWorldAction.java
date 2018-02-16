package com.lee.www.action;

import com.lee.www.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private static int helloCount = 0;
    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore();
        helloCount++;
        System.out.println(helloCount);
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public int getHelloCount() {
        return helloCount;
    }
}
