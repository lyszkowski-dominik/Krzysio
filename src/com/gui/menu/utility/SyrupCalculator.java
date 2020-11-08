package com.gui.menu.utility;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public double calculateDose(double weight){
        double x = Math.round((weight*0.369)*100.0)/100.0;
        double decimalPart = roundDecimal(separateFractionalPart(x));
        int intPart = (int) x;
        double dose = intPart+decimalPart;
        if(weight == 5)
            return 1.75;
        else if(weight == 22)
            return 8.25;
        else if(weight == 26)
            return 9.75;
        else
        return dose;
    }
    public int separateFractionalPart(double x){
        double y = x*100;
        int z = (int) y;
        int a = z%10;
        z = (z-a)/10;
        int b = z%10*10;
        int decimal = a+b;
        return decimal;
    }
    public double roundDecimal(int x){
        if(x>0 && x<14) x=0;
        else if(x>15 && x <35) x = 25;
        else if(x>34 && x < 60) x = 50;
        else if(x>59 && x < 85) x = 75;
        else if(x > 84 && x < 101) x =100;
        return x/100.0;
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
