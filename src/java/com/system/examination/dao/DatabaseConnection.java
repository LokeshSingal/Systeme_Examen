/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kishan
 */
public class DatabaseConnection {
    private DatabaseConnection() throws ClassNotFoundException,SQLException
    {
       // Class.forName( DB_Driver ); 
        //con = DriverManager.getConnection(DB_URL, DB_User, DB_Pwd);
        Class.forName("com.mysql.jdbc.Driver"); 
            con=DriverManager.getConnection("jdbc:mysql://localhost/online_examination_portal?"+ "user='root' & password= ' '");
        System.out.println("Connected");
    }
    
     public static DatabaseConnection getInstance() 
            throws ClassNotFoundException, SQLException {
        if (instance == null )
            instance = new DatabaseConnection();
        return instance;
    }
    
    
    public Connection getConnection() {        
        return con;
    }
    public void close() throws SQLException{
        con.close();
        instance = null;
    }
    
    
    private final String DB_URL = "jdbc:mysql://localhost/online_examination_portal?";
    private final String DB_User = "";
    private final String DB_Pwd = "";
    private final String DB_Driver = "com.mysql.jdbc.Driver";

    private final Connection con;
    private static DatabaseConnection instance = null;
    
}
