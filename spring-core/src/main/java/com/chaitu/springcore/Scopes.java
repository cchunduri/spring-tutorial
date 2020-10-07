package com.chaitu.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scopes {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("scopes.xml");

        Message message = applicationContext.getBean("message", Message.class);

        System.out.println(message.hashCode());

        Message message2 = applicationContext.getBean("message", Message.class);

        System.out.println(message2.hashCode());

        Student student1 = applicationContext.getBean("student", Student.class);
        System.out.println(student1.hashCode());

        Student student2 = applicationContext.getBean("student", Student.class);
        System.out.println(student2.hashCode());

        /*
         * Hashcode is from Object class
         *   unique hash code will be generated for each object
         */
    }
}
