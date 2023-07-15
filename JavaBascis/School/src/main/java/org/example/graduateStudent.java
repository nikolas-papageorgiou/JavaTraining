package org.example;

public class graduateStudent extends Student{
    private String supervisor;
    public graduateStudent(String name, String ID,String supervisor){
        super(name,ID);
        this.supervisor = supervisor;
    }
    public String getSupervisor(){
        return supervisor;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Supervisor name: "+supervisor);
    }
}
