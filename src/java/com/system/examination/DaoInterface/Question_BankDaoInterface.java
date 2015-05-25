/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoInterface;

import com.system.examination.model.Question_Bank;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public interface Question_BankDaoInterface {
    
    public boolean insert(Question_Bank q_bank) throws SQLException;
    public boolean delete(String q_id) throws SQLException;
    public boolean update(Question_Bank q_bank) throws SQLException;
    public ArrayList<Question_Bank> getAll() throws SQLException;
    public Question_Bank findById(int id) throws SQLException;
    
}
