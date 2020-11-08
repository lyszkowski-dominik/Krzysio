package com.gui.menu;

import com.gui.menu.utility.SyrupCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuConstructor implements ActionListener {
    private JPanel panel;
    private  JMenuBar menuBar;
    private  JMenu mFile,mTools,mHelp;
    private  JMenuItem mIExit,mISyrupCalculator,mIAbout;


    public MenuConstructor() {
            this.menuBar = new JMenuBar();
            this.panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
            panel.setLayout(null);
            mFile = new JMenu("Plik");
            mTools = new JMenu("Narzędzia");
            mHelp = new JMenu("Pomoc");

            mIExit = new JMenuItem("Wyjście");
            mIExit.addActionListener(this);
            mISyrupCalculator = new JMenuItem("Kalkulator syropu");
            mISyrupCalculator.addActionListener(this);
            mIAbout = new JMenuItem("O Programie");

            menuBar.add(mFile);
            menuBar.add(mTools);
            menuBar.add(mHelp);
            mFile.add(mIExit);
            mTools.add(mISyrupCalculator);
            mHelp.add(mIAbout);

        }

    public JMenuBar getMenuBar () {
            return menuBar;
        }

    public JPanel getPanel() {
        return panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object checker = e.getSource();
        if(checker == mIExit)
            System.exit(0);
        else if(checker == mISyrupCalculator){
            SyrupCalculator syrupCalculator = new SyrupCalculator(panel);
        }
    }
}
