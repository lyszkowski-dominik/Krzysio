package com.gui.menu.utility;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class SyrupCalculator implements ActionListener {

    JButton retrieveDose;
    JTextField howManyKilos;
    JLabel countedDose,inputWeight,description;

    public SyrupCalculator(JPanel panel){
        description = new JLabel("Program do przeliczania dawki APAP Forte Kids (przyjmuję pełną liczbę kg)");
        description.setBounds(10,20,500,25);
        panel.add(description);
        inputWeight = new JLabel("Podaj wagę: ");
        inputWeight.setBounds(10,50,80,25);
        panel.add(inputWeight);
        howManyKilos = new JTextField();
        howManyKilos.setBounds(150,50,145,25);
        panel.add(howManyKilos);
        retrieveDose = new JButton("Przelicz Dawkę");
        retrieveDose.setBounds(10,110,130,25);
        retrieveDose.addActionListener(this);
        panel.add(retrieveDose);
        countedDose = new JLabel();
        countedDose.setBounds(150,80,200,25);
        panel.add(countedDose);
        panel.repaint();
    }

    public String calculateDose(double weight){
        double x = weight*0.361;
        DecimalFormat df = new DecimalFormat("###.##");
        return df.format(x);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object checker = e.getSource();
        if(checker==retrieveDose)
        {
            double weight = Double.parseDouble(howManyKilos.getText());
            countedDose.setText("Wyliczona dawka to: " + calculateDose(weight) +" ml.");
        }
    }
}
