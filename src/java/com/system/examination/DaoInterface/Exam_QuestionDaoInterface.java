/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoInterface;

import com.system.examination.model.Exam_Questions;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lokesh
 */
public interface Exam_QuestionDaoInterface {
    
    public boolean insert(Exam_Questions e_ques) throws SQLException;
    public boolean delete(int exam_id) throws SQLException;
    public boolean update(Exam_Questions e_ques) throws SQLException;
    public ArrayList<Exam_Questions> getAll() throws SQLException;
    
    
}
