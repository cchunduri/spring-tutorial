package com.chaitu.springcore;

public class Message {
    private String name;

    Message() { }

    Message(String name) {
        System.out.println("Setting via Constructor");
        this.name = name;
    }

    public void displayMessage() {
        System.out.println("Hello!! " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
