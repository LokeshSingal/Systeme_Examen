/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.DaoImplementaion;

import com.system.examination.DaoInterface.CourseDaoInterface;
import com.system.examination.DBConnection.DatabaseConnection;
import com.system.examination.model.Course;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Kishan
 */
public class CourseDaoImple implements CourseDaoInterface{
    
    
    private final Connection con;
    
    public CourseDaoImple() throws SQLException,ClassNotFoundException
    {
        this.con=DatabaseConnection.getInstance().getConnection();
    }

    @Override
    public boolean insert(Course c) throws SQLException {
        
        
        try
        {
            Statement stmt = con.createStatement();
      String query="INSERT INTO course (c_id,c_name,c_desc) values('"+c.getCourseID()+"','"+c.getCourseName()+"','"+c.getCourseDesc()+"')";
      int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return false;
        }
                
      
    }

    @Override
    public boolean delete(String c_id) throws SQLException {
        
        try
        {
            Statement stmt = con.createStatement();
        String query="DELETE FROM course WHERE c_id='"+ c_id +"' ";
        
        int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return false;
        }
        
    }

    @Override
    public boolean update(Course c) throws SQLException {
        
        try
        {
             Statement stmt = con.createStatement();
        String query=" UPDATE course set c_name = '" + c.getCourseName() + 
                "'," + "c_desc = '" + c.getCourseDesc() + 
                "' " +"WHERE c_id = '" + c.getCourseID() + "' ";
        
        int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
        }
        catch(Exception e)
        {
            System.err.println(e);
            return  false;
       }
       
        
        
    }

    @Override
    public ArrayList<Course> getAll() throws SQLException {
        
        
        ArrayList<Course> course_list = new ArrayList<Course>();
        Course c;
        Statement stmt;
        stmt = con.createStatement();      
        try
        {
            ResultSet rs = stmt.executeQuery("SELECT * FROM course");
            
        while ( rs.next() ) {
            c = new Course();
            c.setCourseID(rs.getString("c_id") );
            c.setCourseName(rs.getString("c_name"));
            c.setCourseDesc(rs.getString("c_desc"));
            
            course_list.add( c );
        }        
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        return course_list;
        
        
    }

}
