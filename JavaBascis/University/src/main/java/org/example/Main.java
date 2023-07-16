package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new UnderGraduate("Babis",7.78));
        students.add(new PhDStudent("Takis","Τρόϊκα & Ανεργία"));


        for(var student: students){
            student.printInfo();
        }

    }
}