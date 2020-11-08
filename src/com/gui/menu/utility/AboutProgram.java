package com.gui.menu.utility;

import javax.swing.*;
import java.awt.*;

public class AboutProgram {
    JLabel label;

    public AboutProgram(JPanel panel){
        label = new JLabel("<html><body><center> Program stworzony przez: Dominik Łyszkowski  <br> Wersja: 0.1 (Alpha)  <br> Rok Produkcji 2020  <br> Dla Krzysia!!!</body></html></center>" );
        label.setBounds(160,20,500,200);

        panel.add(label, BorderLayout.CENTER);
        panel.repaint();
    }

}
