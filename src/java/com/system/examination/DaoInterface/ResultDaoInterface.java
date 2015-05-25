/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoInterface;

import com.system.examination.model.Result;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public interface ResultDaoInterface {
    
    public boolean insert(Result result) throws SQLException;
    //public boolean delete(int exam_id) throws SQLException;
    //public boolean update(Result result) throws SQLException;
    public ArrayList<Result> getAll() throws SQLException;
     public ArrayList<Result> findById(int user_id) throws SQLException;
    
}
