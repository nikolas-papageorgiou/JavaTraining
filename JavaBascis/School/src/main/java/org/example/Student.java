package org.example;

import java.util.ArrayList;

public class Student {
    private String name;
    private String ID;
    private ArrayList<Course> courses = new ArrayList<Course>();
    public Student(String aName, String anID){
        name = aName;
        ID = anID;
    }

    public void addCourse(Course aCourse){
        courses.add(aCourse);
    }
    public String getName(){
        return name;
    }
    public String getID(){
        return ID;
    }
    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        for (var course: courses){
            System.out.println("Course name: "+course.getName());
            System.out.println("Course credits: "+course.getCredits());
        }
    }
}
