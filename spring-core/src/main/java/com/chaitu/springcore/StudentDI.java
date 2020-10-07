package com.chaitu.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDI {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("student-beans.xml");

        Student student = context.getBean("student", Student.class);
        student.displayMessage();

        Department department = context.getBean("ece", Department.class);
        System.out.println(department.toString());
    }
}
