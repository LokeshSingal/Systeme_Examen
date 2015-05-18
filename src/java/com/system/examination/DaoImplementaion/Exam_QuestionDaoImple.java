/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.DBConnection.DatabaseConnection;
import com.system.examination.DaoInterface.Exam_QuestionDaoInterface;
import com.system.examination.model.Exam_Questions;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public class Exam_QuestionDaoImple implements Exam_QuestionDaoInterface{
    
    private final Connection con;

    public Exam_QuestionDaoImple(Connection con) throws ClassNotFoundException, SQLException {
        this.con=DatabaseConnection.getInstance().getConnection();
    }
    
    @Override
    public boolean insert(Exam_Questions e_ques) throws SQLException {
          Statement stmt = con.createStatement();
      String query="INSERT INTO exam_question values('"+
              e_ques.getExam_id()+"','"+
              e_ques.getQues_id()+"','"+
              e_ques.getQ_marks()+"' )";
      
      int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public boolean delete(int exam_id) throws SQLException {
        Statement stmt = con.createStatement();
        String query="DELETE FROM exam_question WHERE exam_id='"+ exam_id +"' ";
        
        int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public boolean update(Exam_Questions e_ques) throws SQLException {
        Statement stmt = con.createStatement();
        String query=" UPDATE exam_question set ques_id = '" + e_ques.getQues_id()+ 
                "'," + "q_marks = '" + e_ques.getQ_marks()+ 
                "' " +"WHERE exam_id = '" + e_ques.getExam_id()+ "' ";
        
        int n =stmt.executeUpdate(query);
        if(n > 0 )
          return true;
        else
          return false;
    }

    @Override
    public ArrayList<Exam_Questions> getAll() throws SQLException {
        ArrayList<Exam_Questions> examques = new ArrayList<Exam_Questions>();
        Exam_Questions e_ques;
        Statement stmt;
        stmt = con.createStatement();        
        ResultSet rs = stmt.executeQuery("SELECT * FROM exam_question");
        while ( rs.next() ) {
            e_ques = new Exam_Questions();
            e_ques.setExam_id(rs.getInt("exam_id") );
            e_ques.setQues_id(rs.getString("ques_id"));
            e_ques.setQ_marks(rs.getInt("q_marks"));
            
            
            examques.add( e_ques );
        }        
        
        return examques;
    }
    
}
