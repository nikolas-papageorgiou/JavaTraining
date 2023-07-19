package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChargeCalcualator extends JFrame {

    private JButton calculateChargeButton;
    private JPanel panel;
    private Ship ship;



    public ChargeCalcualator(Ship ship){
        this.ship = ship;

        panel = new JPanel();
        calculateChargeButton = new JButton("Calculate Charge");

        panel.add(calculateChargeButton);

        this.setContentPane(panel);

        ButtonListener buttonListener = new ButtonListener(); //Βήμα 3. Κατασκευή αντικειμένου listener
        calculateChargeButton.addActionListener(buttonListener);//Βήμα 4. Σύνδεση listener με συστατικό του panel

        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("Charge Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class ButtonListener implements ActionListener{//Βήμα 1. Κατασκευή κλάσης listener
        //Βήμα 2. Συγγραφή κώδικα
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Total Charge: "+ship.getTotalCharge());
        }
    }

}
