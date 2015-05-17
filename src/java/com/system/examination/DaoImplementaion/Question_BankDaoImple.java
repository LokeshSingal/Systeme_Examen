/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.DaoInterface.Question_BankDaoInterface;
import com.system.examination.model.Question_Bank;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public class Question_BankDaoImple implements Question_BankDaoInterface{
    
    @Override
    public boolean insert(Question_Bank q_bank) throws SQLException {
        Statement stmt = con.createStatement();
      String query="INSERT INTO exam_qestion values('"+
              +"','"+
               +"','"+
              +"',"+
              +"','"+
              +"','"+
              +"','"+
              +"' )";
      
      int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public boolean delete(int q_id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Question_Bank q_bank) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Question_Bank> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    
}
