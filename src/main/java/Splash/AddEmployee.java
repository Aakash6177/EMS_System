package Splash;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class AddEmployee extends JFrame {

    public AddEmployee(){

        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(330, 30, 500, 50);


        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.getWidth());
        int height = (int) (screenSize.getHeight());


        setSize(width,height);
        setVisible(true);



    }
    public static void main(String[] args) {
        new AddEmployee();
    }
}
