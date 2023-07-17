package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MyFrame extends JFrame {

    private JPanel panel;
    private JTextField StudentNameField, CourseNameField;
    private JButton button;
    private JButton button1;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Student> students = new ArrayList<Student>();
    public MyFrame(){


        Course C1 = new Course("Maths");
        Course C2 = new Course("Java");
        Course C3 = new Course("Databases");
        courses.add(C1);
        courses.add(C2);
        courses.add(C3);

        panel = new JPanel();

        StudentNameField = new JTextField("Student Name");
        CourseNameField = new JTextField("Course title");
        button = new JButton("Create student");
        button1 = new JButton("Print Students");

        panel.add(StudentNameField);
        panel.add(CourseNameField);
        panel.add(button);
        panel.add(button1);

        this.setContentPane(panel);

        ButtonListener buttonListener = new ButtonListener();// Βήμα 3 Δημιουργία αντικειμένου ακροατή
        button.addActionListener(buttonListener);//Βήμα 4 Σύνδεση ακροατή και πηγής συμβάντων

        button1.addActionListener(buttonListener);
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("Event handling example");
        this.setDefaultCloseOperation(3);
    }

    class ButtonListener implements ActionListener { //Βήμα 1 Δημιουργία κλάσης ακροατή

        //Βήμα 2 Συγγραφή κώδικα
        @Override
        public void actionPerformed(ActionEvent e) {
            //Συγγραφή κώδικα για τη δημιουργία φοιτητών


            if (e.getSource() == button) {

                String studentName = StudentNameField.getText();
                Student student = new Student(studentName);
                String courseName = CourseNameField.getText();
                for(var course:courses){
                    if(courseName.equals(course.getName())) {
                        student.setAcourse(course);
                        students.add(student);
                    }
                }

            } else if(e.getSource() == button1){
                for(var student: students){
                    System.out.println("Student name: "+student.getName());
                    System.out.println("Course name "+student.getCourse());
                    System.out.println("==================================================");
                }
            }

        }

    }


}
