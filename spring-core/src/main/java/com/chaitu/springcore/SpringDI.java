package com.chaitu.springcore;

/*
Two types
1. Constructor based injection
2. Setter injection

CI ->
    1. Values will be injected at the time object creation itself
    2. Values should be passed mandatory in CI

    To create Database Connection
        JDBC url
        username
        password
   We'll pass these in a constructor and proceed for DB connection

SI ->
    1. Values will be injected after the object created
    2. Values are optional


 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDI {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Message message = applicationContext.getBean("conInjection", Message.class);
        message.displayMessage();
    }
}
