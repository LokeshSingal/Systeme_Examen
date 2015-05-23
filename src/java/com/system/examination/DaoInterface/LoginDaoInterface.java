/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoInterface;

import com.system.examination.model.Course;
import com.system.examination.model.Login;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public interface LoginDaoInterface {
    
    public boolean insert(Login l) throws SQLException;
    public boolean delete(int u_id) throws SQLException;
    public boolean update(Login l) throws SQLException;
    public ArrayList<Login> getAll() throws SQLException;
    public Login getUserByEmail(String email) throws SQLException;
    
    
}
