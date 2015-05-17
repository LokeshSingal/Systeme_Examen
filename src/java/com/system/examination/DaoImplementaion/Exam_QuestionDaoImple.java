/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.DaoInterface.Exam_QuestionDaoInterface;
import com.system.examination.model.Exam_Questions;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public class Exam_QuestionDaoImple implements Exam_QuestionDaoInterface{
    
    private final Connection con;

    public Exam_QuestionDaoImple(Connection con) {
        this.con = con;
    }
    
    @Override
    public boolean insert(Exam_Questions e_ques) throws SQLException {
          /*Statement stmt = con.createStatement();
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
      else*/
          return false;
    }

    @Override
    public boolean delete(int exam_id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Exam_Questions e_ques) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Exam_Questions> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
