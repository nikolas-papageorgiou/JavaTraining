package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ContainerFrame extends JFrame {
    //Γραφικά συστατικά
    private JTextField codeField ;
    private JTextField destinationField;
    private JTextField weightField;
    private JTextField powerField;
    private JButton createBulkButton;
    private JButton createRefridgeratorButton;
    private JList shipList;

    private JPanel containerPanel;
    private JPanel centralPanel;
    private ArrayList<Ship> ships;
public ContainerFrame(ArrayList<Ship> someShips){

    codeField = new JTextField("Code");
    destinationField = new JTextField("Destination");
    weightField = new JTextField("Weigth");
    powerField = new JTextField("Power");
    createBulkButton = new JButton("Create bulk");
    createRefridgeratorButton = new JButton("Create Refridgerator");
    ships = someShips;
    shipList = new JList();
    containerPanel = new JPanel();
    centralPanel = new JPanel();

    GridLayout grid = new GridLayout(3,2);//Δημιουργούμε ένα πίνακα 3Χ2 στο κάθε κελί θα τοποθετηθεί και ένα συστατικό
    containerPanel.setLayout(grid);

    containerPanel.add(codeField);
    containerPanel.add(destinationField);
    containerPanel.add(weightField);
    containerPanel.add(powerField);
    containerPanel.add(createBulkButton);
    containerPanel.add(createRefridgeratorButton);

    BorderLayout border = new BorderLayout();//Layout manager. Μας επιτρέπει να εισάγουμε συστατικά ΠΑΝΩ,ΚΑΤΩ,ΑΡΙΣΤΕΡΑ,ΔΕΞΙΑ και ΚΕΝΤΡΟ
    centralPanel.setLayout(border);

    this.setContentPane(centralPanel);

    centralPanel.add(shipList,BorderLayout.NORTH);//Εδώ χρησιμοποιήσαμε το βορρά για να τοποθετήσουμε το shipList
    centralPanel.add(containerPanel,BorderLayout.CENTER);//Έδω χρησιμοποιήσαμε το κεντρικό για να τοποθετήσουμε το containerPanel που δημιουργήσαμε πριν


    DefaultListModel model = new DefaultListModel();//Η DefaultListModel συνδέεται με συστατικό και το τροφοδοτεί με πληροφορίες


    for(var ship: ships){
        model.addElement(ship.getName());
    }
    shipList.setModel(model);//Σύνδεση του model με το αντίστοιχο συστατικό


    ButtonListener listener = new ButtonListener();
    createBulkButton.addActionListener(listener);
    createRefridgeratorButton.addActionListener(listener);
    this.setVisible(true);
    this.setSize(400,400);
    this.setTitle("Container Frame");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}


class ButtonListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        String code = codeField.getText();
        String destination = destinationField.getText();
        String selectedShipName = (String) shipList.getSelectedValue();

        Ship selectedShip = null;
        for(Ship ship:ships){
            if(ship.getName().equals(selectedShipName)){
                selectedShip = ship;
            }
        }

        if(e.getSource()==createBulkButton){
            String weightText = weightField.getText();
            int weightInt = Integer.parseInt(weightText);
            Bulk newContainer = new Bulk(code,destination,weightInt);
            selectedShip.addContainer(newContainer);
        }else {
            String powerText = powerField.getText();
            double power = Double.parseDouble(powerText);
            Refridgerator newContainer = new Refridgerator(code,destination,power);
            selectedShip.addContainer(newContainer);
        }
        System.out.println("Selected Ship Charge"+selectedShip.getTotalCharge());
    }
}
}
