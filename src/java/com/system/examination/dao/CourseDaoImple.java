/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.dao;

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
        con=DatabaseConnection.getInstance().getConnection();
    }

    @Override
    public boolean insert(Course c) throws SQLException {
        
      Statement stmt = con.createStatement();
      String query="INSERT INTO course values('"+c.getCourseID()+"','"+c.getCourseName()+"','"+c.getCourseDesc()+"')";
      int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public boolean delete(String c_id) throws SQLException {
        
        Statement stmt = con.createStatement();
        String query="DELETE FROM course WHERE c_id=' "+ c_id +" '; ";
        
        if(stmt.execute(query))
            return true;
        else
            return false;        
    }

    @Override
    public boolean update(Course c) throws SQLException {
        return false;
        
    }

    @Override
    public ArrayList<Course> getAll() throws SQLException {
        return null;
        
    }

}
