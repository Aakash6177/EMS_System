package Splash;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JFrame implements ActionListener {
    JTextField userNameField, passwordField;

    public Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel username = new JLabel("User name");
        username.setBounds(40,20,100,30);
        add(username);

        userNameField = new JTextField();
        userNameField.setBounds(150,20 , 150, 30);
        add(userNameField);

        JLabel password = new JLabel("Password");
        password.setBounds(40,70,100,30);
        add(password);

        passwordField = new JTextField();
        passwordField.setBounds(150,70 , 150, 30);
        add(passwordField);

        JButton login = new JButton("LOGIN");
        login.setBounds(150, 150, 150, 30);
        login.setBackground(Color.BLACK);
        login.addActionListener(this);
        add(login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);

        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String username = userNameField.getText();
            String password = passwordField.getText();

            JDBC_Conn c = new JDBC_Conn();

            String query = "select * from login where username = '"+username+ "' and password = '"+password+"'";

            ResultSet rs = c.st.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                //next class
                new Home();
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Login");
                setVisible(false);
            }
        }
        catch(Exception ae){
            ae.printStackTrace();
        }
    }
}
