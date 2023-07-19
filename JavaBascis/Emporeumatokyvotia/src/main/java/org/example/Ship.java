package org.example;

import java.util.ArrayList;

public class Ship {

    private String name;
    private int capacity;


    private ArrayList<Container> containers = new ArrayList<Container>();

    public Ship(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }


    public void addContainer(Container container){
        if(containers.size() < capacity) {
            containers.add(container);
        }
        else{
            System.out.println("The ship is full!");
        }
    }
    public double getTotalCharge(){
        double totalCharge = 0;
        for(var container: containers){
         totalCharge += container.getCharge();
        }
        return totalCharge;
    }

    public String getName() {
        return name;
    }
}
