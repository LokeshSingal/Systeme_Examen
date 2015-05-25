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
<<<<<<< HEAD
    public int getExamIdByTitle(String title) throws SQLException;
    public ArrayList<Exam_Questions> getQuestionByExamId(int exam_id) throws SQLException;
=======
    
>>>>>>> da6d8d8c909c53b96c24fb1fe2e98e325abe61e0
    
}
