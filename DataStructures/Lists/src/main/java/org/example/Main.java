package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Nikos");
        names.add("Tzeni");
        names.add("Helen");
        names.add("Babis");
        names.add("Mary");
        //Τα ονόματα ταξινομούνται κατά όνομα
        System.out.println("---------------Sorted-----------------------");
        Collections.sort(names);
        System.out.println(names);

        System.out.println("---------------Shuffled------------------");
        Collections.shuffle(names);
        System.out.println(names);
        System.out.println("---------------Reversed------------------");
        Collections.reverse(names);
        System.out.println(names);


        System.out.println("----------------Swap--------------------");
        Collections.swap(names,2,3);
        System.out.println(names);

        names.add("Helen");
        names.add("Helen");
        System.out.println("-------------------Frequency---------------");
        int freq = Collections.frequency(names,"Helen");
        System.out.println("Frequency of Helen "+freq);
    }
}