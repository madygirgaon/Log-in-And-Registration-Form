/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginregistrationproject;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author ADMIN
 */
// This class is responsible for creating mysql connection

public class MySQLConnect {
    
    
    Connection conn;
    public Connection getConn() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb","root","Shree@747");
            JOptionPane.showMessageDialog(null,"Database Connection SuccessFully getconn method");
                return conn;
        }
    
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in Mysql connetct getconn method"+ e);
        }
            return conn;
    
}
}
