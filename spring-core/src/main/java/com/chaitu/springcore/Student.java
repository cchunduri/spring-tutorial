package com.chaitu.springcore;

import java.util.List;

public class Student {
    String name;
    int rno;
    Department department;
    List<String> subjects;

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void displayMessage() {
        System.out.println("Name::" + name + "::Rno " + rno + "::department " + department + "::subjects" + subjects.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rno=" + rno +
                ", department=" + department +
                '}';
    }
}
