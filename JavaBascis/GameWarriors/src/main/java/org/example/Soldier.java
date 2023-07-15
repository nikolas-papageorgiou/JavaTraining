package org.example;

public class Soldier {
    private String ID;
    private static int counter = 0;

    public Soldier(String anID){
        ID = anID;
        counter++;
    }
    public static int getCounter(){
        return counter;
    }
}
