package com.chaitu.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Autowiring {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("autowiring.xml");

//        Student student = applicationContext.getBean("student", Student.class);
//        System.out.println(student);

//        Student student2 = applicationContext.getBean("student2", Student.class);
//        System.out.println(student2);

        Student student3 = applicationContext.getBean("student3", Student.class);
        System.out.println(student3);

    }
}
