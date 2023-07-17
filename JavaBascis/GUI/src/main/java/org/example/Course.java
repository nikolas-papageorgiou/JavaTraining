package org.example;

public class Course {
    private String name;
    private Course course;
    public Course(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
