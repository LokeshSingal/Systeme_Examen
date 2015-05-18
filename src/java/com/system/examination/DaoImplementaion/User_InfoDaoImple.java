/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.DBConnection.DatabaseConnection;
import com.system.examination.DaoInterface.User_InfoDaoInterface;
import com.system.examination.model.User_info;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public class User_InfoDaoImple implements User_InfoDaoInterface{
    
    private final Connection con;

    public User_InfoDaoImple() throws ClassNotFoundException, SQLException {
        this.con=DatabaseConnection.getInstance().getConnection();
    }
    

    @Override
    public boolean insert(User_info ui) throws SQLException {
      Statement stmt = con.createStatement();
      String query="INSERT INTO user_info values('"+
              ui.getUser_id()+"','"+
              ui.getName()+"','"+
              ui.getImage()+"','"+
              ui.getInstitute_name()+"','"+
              ui.getProgram()+"','"+
              ui.getGender()+"' )";
      
      int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    
    }

    @Override
    public boolean delete(int ui) throws SQLException {
        Statement stmt = con.createStatement();
        String query="DELETE FROM user_info WHERE user_id='"+ ui +"' ";
        
        int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public boolean update(User_info ui) throws SQLException {
              
        Statement stmt = con.createStatement();
        String query=" UPDATE user_info set name = '" + ui.getName()+ 
                "'," + "Image = '" + ui.getImage()+ 
                "'," + "Institute_name = '" + ui.getInstitute_name()+ 
                "'," + "Program = '" + ui.getProgram()+ 
                "'," + "Gender = '" + ui.getGender()+
                "' " +"WHERE user_id = '" + ui.getUser_id()+ "' ";
        
        int n =stmt.executeUpdate(query);
        if(n > 0 )
          return true;
        else
          return false;
    }

    @Override
    public ArrayList<User_info> getAll() throws SQLException {
        ArrayList<User_info> userinfo = new ArrayList<User_info>();
        User_info ui;
        Statement stmt;
        stmt = con.createStatement();        
        ResultSet rs = stmt.executeQuery("SELECT * FROM user_info");
        while ( rs.next() ) {
            ui = new User_info();
            ui.setGender(rs.getString("gender") );
            ui.setImage(rs.getString("Image"));
            ui.setInstitute_name(rs.getString("Institute_name"));
            ui.setName(rs.getString("name"));
            ui.setProgram(rs.getString("Program"));
            ui.setUser_id(rs.getInt("user_id"));
            
            userinfo.add( ui );
        }        
        
        return userinfo;
    }
    
    
    
}
