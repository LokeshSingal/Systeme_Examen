/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.DBConnection.DatabaseConnection;
import com.system.examination.DaoInterface.Question_BankDaoInterface;
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
      String query="INSERT INTO question_bank (instructor_id,q_desc,question,optionA,optionB,optionC,optionD,solution,level,course_id) values('"+
              q_bank.getInstructor_id()+"','"+
              q_bank.getQ_desc()+"','"+
              q_bank.getQuestion()+"','"+
              q_bank.getOptionA()+"','"+
              q_bank.getOptionB()+"','"+
              q_bank.getOptionC()+"','"+
              q_bank.getOptionD()+"','"+
              q_bank.getSolution()+"','"+
              q_bank.getLevel()+"','"+
       
              q_bank.getCourse_id()+"' )";
      int n=0;
      try
      {
      n =stmt.executeUpdate(query);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
      if(n > 0 )
          return true;
      else
          return false;
          
    }

    @Override
    public boolean delete(String q_id) throws SQLException {
        Statement stmt = con.createStatement();
        String query="DELETE FROM question_bank WHERE q_id="+ q_id +" ";
        
        int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public boolean update(Question_Bank q_bank) throws SQLException {
         Statement stmt = con.createStatement();
        String query=" UPDATE question_bank set instructor_id = '" + q_bank.getInstructor_id()+ 
                "'," + "q_desc = '" + q_bank.getQ_desc()+ 
                "'," + "question = '" + q_bank.getQuestion()+ 
                "'," + "optionA = '" + q_bank.getOptionA()+ 
                "'," + "optionB = '" + q_bank.getOptionB()+ 
                "'," + "optionC = '" + q_bank.getOptionC()+ 
                "'," + "optionD = '" + q_bank.getOptionD()+ 
                "'," + "solution = '" + q_bank.getSolution()+ 
                "'," + "level = '" + q_bank.getLevel()+ 
                "'," + "course_id = '" + q_bank.getCourse_id()+
                "' " +"WHERE q_id = '" + q_bank.getQues_id()+ "' ";
        int n=0;
        try
        {
        n =stmt.executeUpdate(query);
        }catch(Exception e)
        {
            System.out.println(e);
        }
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
            q_bank.setCourse_id(rs.getString("course_id") );
            q_bank.setInstructor_id(rs.getInt("instructor_id"));
            q_bank.setQ_desc(rs.getString("q_desc"));
            q_bank.setQuestion(rs.getString("question"));
            q_bank.setOptionA(rs.getString("optionA"));
            q_bank.setOptionB(rs.getString("optionB"));
            q_bank.setOptionC(rs.getString("optionC"));
            q_bank.setOptionD(rs.getString("optionD"));
            q_bank.setSolution(rs.getString("solution"));
            q_bank.setLevel(rs.getString("level"));
            q_bank.setCourse_id(rs.getString("course_id"));
            q_bank.setQues_id(rs.getInt("q_id"));
            
            quesbank.add( q_bank );
        }        
        
        return quesbank;
    }

    @Override
    public Question_Bank findById(int id) throws SQLException {
        Question_Bank q_bank=new Question_Bank();
        Statement stmt;
        stmt = con.createStatement();        
        ResultSet rs = stmt.executeQuery("SELECT * FROM question_bank where q_id="+id);
        if(rs.next())
        {
            q_bank.setCourse_id(rs.getString("course_id") );
            q_bank.setInstructor_id(rs.getInt("instructor_id"));
            q_bank.setQ_desc(rs.getString("q_desc"));
            q_bank.setQuestion(rs.getString("question"));
            q_bank.setOptionA(rs.getString("optionA"));
            q_bank.setOptionB(rs.getString("optionB"));
            q_bank.setOptionC(rs.getString("optionC"));
            q_bank.setOptionD(rs.getString("optionD"));
            q_bank.setSolution(rs.getString("solution"));
            q_bank.setLevel(rs.getString("level"));
            q_bank.setCourse_id(rs.getString("course_id"));
            q_bank.setQues_id(rs.getInt("q_id"));
        }
        return q_bank;
    }
    }

    

