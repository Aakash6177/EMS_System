package Splash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame implements ActionListener {

    public Splash() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.CYAN);
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);

        JButton click_here = new JButton("Click here to continue");
        click_here.setBounds(400, 400, 300, 70);
        click_here.setBackground(Color.BLACK);
        click_here.addActionListener(this);
        image.add(click_here);

        setSize(1170, 650);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Splash();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();
    }
}
