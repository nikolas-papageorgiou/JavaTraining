import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class GUI extends JFrame {
    private JTextField nameField;
    private JButton addButton;
    private JList list;
    private JButton sortButton;
    private JPanel panel;
    private DefaultListModel model;

    private JScrollPane scrollPane;


    public GUI(){

        nameField = new JTextField(10);
        addButton = new JButton("Add");
        list = new JList();
        sortButton = new JButton("Sort");
        panel = new JPanel();
        model = new DefaultListModel();
        list.setModel(model);
        scrollPane = new JScrollPane(list);





        panel.add(nameField);
        panel.add(addButton);
        panel.add(scrollPane);
        panel.add(sortButton);


        this.setContentPane(panel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String name = nameField.getText();
                 model.addElement(name);
            }
        });

        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Βήμα 1. Πέρνουμε τα στοιχεία που είναι αποθηκεύμενα στο list του model
                ArrayList<String> names = Collections.list(model.elements());
                //Βήμα 2. Ταξινομούμε τα στοιχεία
                Collections.sort(names);
                //Βήμα 3. Καθαρίζουμε το model από αρχικά αταξινόμητα στοιχεία
                model.clear();
                //Ξανά εισάγω τα ονόματα στη λίστα ταξινομημένα
                for(String name:names){
                    model.addElement(name);
                }
            }
        });

        this.setVisible(true);
        this.setSize(500,500);
        this.setTitle("GUI & Data Structures");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
