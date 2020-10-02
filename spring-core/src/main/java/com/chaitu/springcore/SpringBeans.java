package com.chaitu.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeans {

    public static void main(String[] args) {

        //Loads Beans into memory
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans.xml");


        //fetches bean from the memory and assigns it to a refference
        Message message = applicationContext.getBean("message", Message.class);
        message.displayMessage();

        Message message2 = applicationContext.getBean("message2", Message.class);
        message2.displayMessage();
    }
}
