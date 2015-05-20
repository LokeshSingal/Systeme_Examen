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
      String query="INSERT INTO result values('"+
              result.getR_id()+"','"+
              result.getR_user_id()+"','"+
              result.getR_exam_id()+"','"+
              result.getR_Date()+"','"+
              result.getScore()+"' )";
      
      int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public ArrayList<Result> getAll() throws SQLException {
       ArrayList<Result> userresult = new ArrayList<Result>();
        Result result;
        Statement stmt;
        stmt = con.createStatement();        
        ResultSet rs = stmt.executeQuery("SELECT * FROM result");
        while ( rs.next() ) {
            result = new Result();
            result.setR_exam_id(rs.getInt("exam_id") );
            result.setR_id(rs.getInt("r_id"));
            result.setR_user_id(rs.getInt("user_id"));
            result.setR_Date(rs.getDate("date"));
            result.setScore(rs.getInt("score"));
            
            userresult.add( result );
        }        
        
        return userresult;
    }
    
    
}
