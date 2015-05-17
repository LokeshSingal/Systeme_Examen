/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoInterface;

import com.system.examination.model.Exam_list;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public interface Exam_ListDaoInterface {
    
    public boolean insert(Exam_list el) throws SQLException;
    public boolean delete(int exam_id) throws SQLException;
    public boolean update(Exam_list el) throws SQLException;
    public ArrayList<Exam_list> getAll() throws SQLException;
    
    
}
