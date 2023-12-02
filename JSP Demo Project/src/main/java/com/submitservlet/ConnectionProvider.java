package com.submitservlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionProvider {
	
	static String URL = "jdbc:mysql://localhost:3306/jspdemoproject";
    static String user = "root";
    static String pass = "12345678";
    static Connection con;

    public static Connection getDBcon() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver Loaded");

        try {
            con = DriverManager.getConnection(URL, user, pass);
            System.out.println("Connection Established");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionProvider.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error : " + ex.getMessage());
            // return con;
        }
        return con;
    }

}
