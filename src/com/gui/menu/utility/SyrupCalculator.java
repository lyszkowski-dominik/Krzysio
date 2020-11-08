package com.gui.menu.utility;

import javax.swing.*;
import java.awt.*;

public class SyrupCalculator {

    JButton retrieveDose;
    JTextField howManyKilos;
    JLabel countedDose,inputWeight;

    public SyrupCalculator(JPanel panel){
        inputWeight = new JLabel("Podaj wagę: ");
        inputWeight.setForeground(Color.BLACK);
        inputWeight.setBounds(10,20,80,25);
        panel.add(inputWeight);
        howManyKilos = new JTextField();
        howManyKilos.setBounds(150,20,145,25);
        panel.add(howManyKilos);
        retrieveDose = new JButton("Przelicz Dawkę");
        retrieveDose.setBounds(10,80,130,25);
        panel.add(retrieveDose);
    }
}
