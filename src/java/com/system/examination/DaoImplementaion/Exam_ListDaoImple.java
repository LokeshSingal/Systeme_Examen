/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.DBConnection.DatabaseConnection;
import com.system.examination.DaoInterface.Exam_ListDaoInterface;
import com.system.examination.model.Exam_list;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public class Exam_ListDaoImple implements Exam_ListDaoInterface{

    
    private final Connection con;
    
    public Exam_ListDaoImple() throws ClassNotFoundException, SQLException {
        this.con = DatabaseConnection.getInstance().getConnection();
    }

    
    @Override
    public boolean insert(Exam_list el) throws SQLException {
        Statement stmt = con.createStatement();
      String query="INSERT INTO exam_list (instructor_id,exam_title,exam_desc,no_of_ques,duration,show_instant_result,declare_date,total_marks,username,password) values('"+
              el.getInstructor_id() +"','"+
              el.getExam_title() +"','"+
              el.getExam_desc()+"','"+
              el.getNo_of_ques()+"','"+
              el.getDuration()+"','"+
              el.getShow_instant_result()+"','"+
              el.getDeclare_date()+"','"+
              el.getTotal_marks()+"','"+
              el.getExam_username()+"','"+
              el.getExam_password()+"' )";
      
      int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public boolean delete(int exam_id) throws SQLException {
        Statement stmt = con.createStatement();
       String query=" DELETE FROM exam_list WHERE exam_id='"+ exam_id +"' ";
        //String query="DELETE FROM course WHERE c_id='"+ c_id +"' ";
        int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public boolean update(Exam_list el) throws SQLException {
        Statement stmt = con.createStatement();
       String query=" UPDATE exam_list set instructor_id = '" + el.getInstructor_id()+ 
                "','"+ "exam_title = '" + el.getExam_title()+
                "'," + "exam_desc = '" + el.getExam_desc()+ 
                "'," + "no_of_ques = '"+ el.getNo_of_ques()+
                "'," + "duration = '" + el.getDuration()+
                "'," + "show_instant_result = '" + el.getShow_instant_result()+
                "'," + "declare_date = '"+ el.getDeclare_date()+
                "'," + "total_marks = '"+ el.getTotal_marks()+
                "'," + "username = '"+ el.getExam_username()+
                "'," + "password = '"+ el.getExam_password()+
                "'"  + "WHERE exam_id = '" + el.getExam_id()+ "' ";
      
         int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public ArrayList<Exam_list> getAll() throws SQLException {
        
        ArrayList<Exam_list> exam_list = new ArrayList<Exam_list>();
        Exam_list el;
        Statement stmt;
        stmt = con.createStatement();        
        ResultSet rs = stmt.executeQuery("SELECT * FROM exam_list");
        while ( rs.next() ) {
            el = new Exam_list();
            
            el.setExam_id(rs.getInt("exam_id"));
            el.setInstructor_id(rs.getInt("instructor_id"));
            el.setExam_title("exam_title");
            el.setExam_desc(rs.getString("exam_desc"));
            el.setNo_of_ques(rs.getInt("no_of_ques"));
            el.setDuration(rs.getTime("duration"));
            el.setShow_instant_result(rs.getInt("show_instant_result"));
            el.setDeclare_date(rs.getDate("declare_date"));
            el.setTotal_marks(rs.getInt("total_marks"));
            el.setExam_username(rs.getString("username"));
            el.setExam_password(rs.getString("password"));
            
            exam_list.add( el );
        }        
        
        return exam_list;
    }
    
}
