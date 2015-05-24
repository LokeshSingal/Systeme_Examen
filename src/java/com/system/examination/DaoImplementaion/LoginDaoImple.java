/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.DBConnection.DatabaseConnection;
import com.system.examination.DaoInterface.LoginDaoInterface;
import com.system.examination.model.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public class LoginDaoImple implements LoginDaoInterface  {
    
    
    private final Connection con;

    public LoginDaoImple() throws SQLException,ClassNotFoundException {
        this.con = DatabaseConnection.getInstance().getConnection();
        
        
    }

    @Override
    public boolean insert(Login l) throws SQLException {
      Statement stmt = con.createStatement();
      String query="INSERT INTO login_credentials (username,password,email,instructor,student,admin) values('"+
              l.getUser_username() +"','"+
              l.getUser_password()+"','"+
              l.getUser_email()+"',"+
              l.getPri_Instructor()+","+
              l.getPri_Student()+","+
      
              l.getPri_Admin()+" )";
      int n=0;
      try
      {
       n =stmt.executeUpdate(query);
      }catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
      if(n > 0 ){
          System.out.println(n);
         
          return true;
      }
      else
          return false;
    }

    @Override
    public boolean delete(int u_id) throws SQLException {
       Statement stmt = con.createStatement();
       String query=" DELETE FROM login_credentials WHERE user_id='"+ u_id +"' ";
        //String query="DELETE FROM course WHERE c_id='"+ c_id +"' ";
        int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }
   
    @Override
    public boolean update(Login l) throws SQLException {
        
       Statement stmt = con.createStatement();
       String query=" UPDATE login_credentials set username = '" + l.getUser_username()+ 
                "'," + "password = '" + l.getUser_password()+ 
                "'," + "email = '"+ l.getUser_email() +
                "'"  + "WHERE user_id = '" + l.getUser_id() + "' ";
      
         int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
        
    }

    @Override
    public ArrayList<Login> getAll() throws SQLException {
        
        ArrayList<Login> User_list = new ArrayList<Login>();
        Login l;
        Statement stmt;
        stmt = con.createStatement();        
        ResultSet rs = stmt.executeQuery("SELECT * FROM login_credentials");
        while ( rs.next() ) {
            l = new Login();
            l.setUser_id(rs.getInt("user_id"));
            l.setUser_username(rs.getString("username"));
            l.setUser_password(rs.getString("password"));
            l.setUser_email(rs.getString("email"));
            l.setPri_Instructor(rs.getInt("instructor"));
            l.setPri_Student(rs.getInt("student"));
            l.setPri_Admin(rs.getInt("admin"));
            
            User_list.add( l );
        }        
        return User_list;
    }

    @Override
    public Login getUserByEmail(String email) throws SQLException {
        
        Login l;
        Statement stmt;
        stmt = con.createStatement();        
        ResultSet rs = stmt.executeQuery("SELECT * FROM login_credentials Where email='"+email+"'");
        if(rs.next())
        {
            l = new Login();
            l.setUser_id(rs.getInt("user_id"));
            l.setUser_username(rs.getString("username"));
            l.setUser_password(rs.getString("password"));
            l.setUser_email(rs.getString("email"));
            l.setPri_Instructor(rs.getInt("instructor"));
            l.setPri_Student(rs.getInt("student"));
            l.setPri_Admin(rs.getInt("admin"));
        }
        else
        {
            l=null;
        }
            
                
        
        return l;
    }
        
        

    
    }
    
    
