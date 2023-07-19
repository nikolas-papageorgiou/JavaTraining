package org.example;

public class Bulk extends Container{
    private int weight;

    public Bulk(String code, String destination, int weight){
        super(code,destination);
        this.weight = weight;
    }


    public int getWeight(){
        return weight;
    }

    public double getCharge(){
        return 10*weight;
    }
}
