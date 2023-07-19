package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> johnsBooks = new ArrayList<String>();
        ArrayList<String>  marysBooks = new ArrayList<String>();
        johnsBooks.add("The Catcher in the Rye");
        johnsBooks.add("Steven Hawking");
        marysBooks.add("Nefelim");
        marysBooks.add("Giati mas psekazoun");

        HashMap<String, ArrayList<String>> library = new HashMap<String, ArrayList<String>>();

        library.put("John",johnsBooks);
        library.put("Mary",marysBooks);
        for(String name: library.keySet()){
            System.out.println(name+" has borrowed ");
            for (String titleBook:library.get(name)){
                System.out.println(titleBook);
            }
        }
    }
}