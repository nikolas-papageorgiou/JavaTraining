package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class InputData {
    public void readData(ArrayList<Student> students){
        String supervisor = null;
        Student student;
        boolean more = true;
        while (more){
            String selection = JOptionPane.showInputDialog("1 for student. 2 for graduate");
            int choice = Integer.parseInt(selection);
            String name = JOptionPane.showInputDialog("Name");
            String ID = JOptionPane.showInputDialog("ID");

            if(choice==2){
                supervisor = JOptionPane.showInputDialog("Supervisor");
            }
            if(choice== 1){
               student = new Student(name,ID);
            }else{
                student = new graduateStudent(name,ID,supervisor);
            }

            students.add(student);
            String answer = JOptionPane.showInputDialog("More students?(Υ/Ν)");
            if(answer.equals("N"))
                more = !more;


        }



    }
}
