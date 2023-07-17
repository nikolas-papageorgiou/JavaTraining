package org.example;

import javax.print.DocFlavor;

public class Student {
    private String name;
    private Course acourse;
    public Student(String name){
        this.name = name;
    }

    public void setAcourse(Course course){
        this.acourse = course;
    }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return acourse.getName();
    }


}
