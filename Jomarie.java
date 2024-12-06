/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;

 
public class Jomarie {
    public static Connection getConnection() {
        Connection con = null;
        try {
            // Load the MySQL JDBC Driver (Updated class name)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marjodb", "root", "03182005Elola");
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Driver not found: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Failed to connect to the database: " + ex.getMessage());
        }
        return con;
        
    }

    public static void main(String[] args) {
        
        
        Connection con = Jomarie.getConnection();
        if (con != null) {
            System.out.println("Connection successful!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Jlogin().setVisible(true);
            }
        });}
}

   
