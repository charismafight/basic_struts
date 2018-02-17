package com.lee.www.action;

import com.lee.www.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private static int helloCount = 0;
    private MessageStore messageStore;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String userName;

    public String execute() {
        messageStore = new MessageStore();
        helloCount++;
        if (userName != null) {
            messageStore.setMessage(messageStore.getMessage() + " " + userName);
        }
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public int getHelloCount() {
        return helloCount;
    }

}
