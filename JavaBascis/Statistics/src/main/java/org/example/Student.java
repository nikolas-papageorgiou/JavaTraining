package org.example;

public class Student implements Measurable {
    private String name ;
    private double GPA;

    public Student(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
    }

    public double getGPA(){
        return GPA;
    }
    @Override
    public double getMeasure() {
        return GPA;
    }
}

