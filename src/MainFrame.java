import com.gui.menu.MenuConstructor;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    private MenuConstructor menuConstructor;
    private JFrame frame;


    public MainFrame(){
        this.frame = new JFrame();
        this.menuConstructor = new MenuConstructor();

        setJMenuBar(menuConstructor.getMenuBar());
        setTitle("Projekt Krzyś");
        setSize(600,300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(menuConstructor.getPanel());
        setVisible(true);
    }

}
