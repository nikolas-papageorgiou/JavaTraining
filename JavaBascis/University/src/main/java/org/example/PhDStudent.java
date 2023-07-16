package org.example;

public class PhDStudent extends Student{
    private String thesis;

    public PhDStudent(String name, String thesis){
        super(name);
        this.thesis = thesis;
    }
    public String getThesis(){
        return thesis;
    }
    public void printInfo(){
        System.out.println("PhD Student");
        System.out.println("Name: "+ getName());
        System.out.println("Thesis: "+thesis);
    }
}
