/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.DBConnection.DatabaseConnection;
import com.system.examination.DaoInterface.ResultDaoInterface;
import com.system.examination.model.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public class ResultDaoImple implements ResultDaoInterface {

    
    private final Connection con;
    
    public ResultDaoImple() throws ClassNotFoundException, SQLException {
        this.con=DatabaseConnection.getInstance().getConnection();
    }
    

    @Override
    public boolean insert(Result result) throws SQLException {
      Statement stmt = con.createStatement();
      String query="INSERT INTO user_info values('"+
              result.getR_exam_id()+"','"+
              result.getR_user_id()+"','"+
              result.getR_ques_id()+"','"+
              result.getSubmission()+"','"+
              result.isEvaluation()+"' )";
      
      int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public ArrayList<Result> getAll() throws SQLException {
       ArrayList<Result> userinfo = new ArrayList<Result>();
        Result result;
        Statement stmt;
        stmt = con.createStatement();        
        ResultSet rs = stmt.executeQuery("SELECT * FROM user_info");
        while ( rs.next() ) {
            result = new Result();
            result.setR_exam_id(rs.getInt("exam_id") );
            result.setR_ques_id(rs.getString("ques_id"));
            result.setR_user_id(rs.getInt("user_id"));
            result.setSubmission(rs.getString("submission"));
            result.setEvaluation(rs.getBoolean("evaluation"));
            
            userinfo.add( result );
        }        
        
        return userinfo;
    }
    
    
}
