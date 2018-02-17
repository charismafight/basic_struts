package com.lee.www.model;

public class MessageStore {
    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public MessageStore() {
        message = "Hello world";
    }

    public String getMessage() {
        return message;
    }
}
