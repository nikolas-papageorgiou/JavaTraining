package org.example;

import javax.swing.*;

public class myFrame extends JFrame {

    private JPanel panel ;
    private JTextField textField;
    private JButton button;
    public myFrame(){

        panel = new JPanel();//Βήμα 1. Δημιουργία υποδοχέα
        textField = new JTextField(10);//Βήμα 2.
        button = new JButton("Press Me");//Δημιουργία γραφικών συστατικών

        panel.add(textField);//Βήμα 3
        panel.add(button);//Προσθήκη γραφικών συστατικών στο panel

        this.setContentPane(panel);  //Βήμα 4. Προσαρμογή υποδοχέα

        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("My first impressive frame!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
