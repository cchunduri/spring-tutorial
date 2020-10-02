package com.chaitu.springcore;

public class Message {
    private String name;

    public void displayMessage() {
        System.out.println("Hello!! " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
