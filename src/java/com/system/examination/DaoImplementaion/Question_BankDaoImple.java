/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.DBConnection.DatabaseConnection;
import com.system.examination.DaoInterface.Question_BankDaoInterface;
import com.system.examination.model.Question_Bank;
import com.system.examination.model.Question_Bank;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public class Question_BankDaoImple implements Question_BankDaoInterface{
    private final Connection con;

    public Question_BankDaoImple() throws ClassNotFoundException, SQLException {
        this.con=DatabaseConnection.getInstance().getConnection();
    }
    
    @Override
    public boolean insert(Question_Bank q_bank) throws SQLException {
    Statement stmt = con.createStatement();
      String query="INSERT INTO question_bank values('"+
              q_bank.getR_exam_id()+"','"+
              q_bank.getR_user_id()+"','"+
              q_bank.getR_ques_id()+"','"+
              q_bank.getSubmission()+"','"+
              q_bank.isEvaluation()+"' )";
      
      int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
          
    }

    @Override
    public boolean delete(int q_id) throws SQLException {
        Statement stmt = con.createStatement();
        String query="DELETE FROM question_bank WHERE question_bank='"+ q_id +"' ";
        
        int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public boolean update(Question_Bank q_bank) throws SQLException {
         Statement stmt = con.createStatement();
        String query=" UPDATE question_bank set name = '" + q_bank.getName()+ 
                "'," + "Image = '" + q_bank.getImage()+ 
                "'," + "Institute_name = '" + q_bank.getInstitute_name()+ 
                "'," + "Program = '" + q_bank.getProgram()+ 
                "'," + "Gender = '" + q_bank.getGender()+
                "' " +"WHERE user_id = '" + q_bank.getUser_id()+ "' ";
        
        int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public ArrayList<Question_Bank> getAll() throws SQLException {
        ArrayList<Question_Bank> quesbank = new ArrayList<Question_Bank>();
        Question_Bank q_bank;
        Statement stmt;
        stmt = con.createStatement();        
        ResultSet rs = stmt.executeQuery("SELECT * FROM question_bank");
        while ( rs.next() ) {
            q_bank = new Question_Bank();
            q_bank.setGender(rs.getString("gender") );
            q_bank.setImage(rs.getString("Image"));
            q_bank.setInstitute_name(rs.getString("Institute_name"));
            q_bank.setName(rs.getString("name"));
            q_bank.setProgram(rs.getString("Program"));
            q_bank.setUser_id(rs.getInt("user_id"));
            
            quesbank.add( q_bank );
        }        
        
        return quesbank;
    }
    }

    

