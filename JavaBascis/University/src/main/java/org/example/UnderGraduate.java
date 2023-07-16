package org.example;

public class UnderGraduate extends Student{
    private double GPA;
    public UnderGraduate(String name,double gPA){
        super(name);
        GPA = gPA;
    }
    public double getGPA(){
        return GPA;
    }

    public void printInfo(){
        System.out.println("Undergraduate Student");
        System.out.println("Name: "+ getName());
        System.out.println("Grade Point Average: "+GPA);
    }
}
