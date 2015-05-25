/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoInterface;

import com.system.examination.model.Login;
import com.system.examination.model.User_info;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public interface User_InfoDaoInterface {
    
    
    public boolean insert(User_info ui) throws SQLException;
    public boolean delete(int ui) throws SQLException;
    public boolean update(User_info ui) throws SQLException;
    public ArrayList<User_info> getAll() throws SQLException;
    
    
}
