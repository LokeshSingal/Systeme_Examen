/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.DBConnection.DatabaseConnection;
import com.system.examination.DaoInterface.LoginDaoInterface;
import com.system.examination.model.Course;
import com.system.examination.model.Login;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public class LoginDaoImple  {
    
    
    private final Connection con;

    public LoginDaoImple(Connection con) throws SQLException,ClassNotFoundException {
        this.con = DatabaseConnection.getInstance().getConnection();
    }

    
   
    
}
