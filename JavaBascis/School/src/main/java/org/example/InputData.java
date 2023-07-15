package org.example;

import javax.swing.*;
import java.util.ArrayList;

public class InputData {
    public void readData(ArrayList<Student> students){
        boolean more = true;
        while (more){
            String selection = JOptionPane.showInputDialog("1 for student. 2 for graduate");
            int choice = Integer.parseInt(selection);
            String name = JOptionPane.showInputDialog("Name");
            String ID = JOptionPane.showInputDialog("ID");
            if(choice==2){
                String supervisor = JOptionPane.showInputDialog("Supervisor");
            }
        }

    }
}
