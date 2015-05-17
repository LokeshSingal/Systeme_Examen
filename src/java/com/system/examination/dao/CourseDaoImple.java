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
      String qury="INSERT INTO course values('"+c.getCourseID()+"','"+c.getCourseName()+"','"+c.getCourseDesc()+"')";
      if(stmt.execute(qury))
      {
          return true;
      }
      else
      {
          return false;
      }
      
    }

}
