/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.DBConnection.DatabaseConnection;
import com.system.examination.DaoInterface.SubmissionDaoInterface;
import com.system.examination.model.Submission;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public class SubmissionDaoImple implements SubmissionDaoInterface {
    
     
    private final Connection con;
    
    public SubmissionDaoImple() throws ClassNotFoundException, SQLException {
        this.con=DatabaseConnection.getInstance().getConnection();
    }
    


    @Override
    public boolean insert(Submission su) throws SQLException {
      Statement stmt = con.createStatement();
      String query="INSERT INTO submission (r_id,ques_id,submission,evaluation) values('"+
              su.getR_id()+"','"+
              su.getS_ques_id()+"','"+
              su.getSubmission()+"','"+
              su.getEvaluation()+"' )";
      
      int n =stmt.executeUpdate(query);
      if(n > 0 )
          return true;
      else
          return false;
    }

    @Override
    public ArrayList<Submission> getAll() throws SQLException {
        ArrayList<Submission> usersub = new ArrayList<Submission>();
        Submission su;
        Statement stmt;
        stmt = con.createStatement();        
        ResultSet rs = stmt.executeQuery("SELECT * FROM submission");
        while ( rs.next() ) {
            su = new Submission();
            
            su.setR_id(rs.getInt("r_id") );
            su.setS_ques_id(rs.getInt("ques_id"));
            su.setSubmission(rs.getString("submission"));
            su.setEvaluation(rs.getInt("evaluation"));
            
            usersub.add( su );
        }        
        
        return usersub;
    }
    
}
