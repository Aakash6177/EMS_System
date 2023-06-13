package Splash;

import java.sql.*;

public class JDBC_Conn {
    Connection conn=null;
    Statement st = null;
    ResultSet rs = null;


    public JDBC_Conn(){
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://dpg-chnp60ik728jv5cg9cs0-a.oregon-postgres.render.com/akly_db", "dbuser", "hwmeCYShoFiWJ8cYFxTxkNyQ4yHAUX8W");
            st = conn.createStatement();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
