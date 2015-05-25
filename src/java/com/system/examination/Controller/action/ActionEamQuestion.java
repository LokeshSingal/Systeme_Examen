/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.action;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.Exam_QuestionDaoImple;
import com.system.examination.model.Exam_Questions;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public abstract class ActionEamQuestion implements Action {

    protected Exam_Questions getExamQuestionObjectRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        
        Exam_Questions exam_ques = new Exam_Questions();

        //int exam_id = Integer.parseInt(req.getParameter(null));
        //int ques_id = Integer.parseInt
        int q_marks = Integer.parseInt(req.getParameter("marks"));

        exam_ques.setQ_marks(q_marks);
        
        
        return exam_ques;
    }
    
    protected void putExamQuestionRequest(HttpServletRequest req,HttpServletResponse resp) throws ClassNotFoundException, SQLException
    {
        Exam_QuestionDaoImple eqd = new Exam_QuestionDaoImple();
        ArrayList<Exam_Questions> exam_ques = eqd.getAll();
        req.setAttribute("exam_ques", exam_ques);
    }
}
