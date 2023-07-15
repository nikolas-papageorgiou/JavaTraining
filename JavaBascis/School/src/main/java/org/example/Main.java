package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Course> courses = new ArrayList<Course>();

        Course C1 = new Course("Java",5);
        Course C2 = new Course("Math",5);

        courses.add(C1);
        courses.add(C2);
        InputData.readData(students, courses);
        for(Student student: students){
            student.printInfo();

        }
    }
}