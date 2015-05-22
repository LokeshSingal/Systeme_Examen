/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.action;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.Exam_QuestionDaoImple;
import com.system.examination.model.Exam_Questions;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public abstract class ActionEamQuestion implements Action {

    protected Exam_Questions getExamQuestionObjectRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Exam_Question exam_ques = Exam_Questions();

        //int exam_id = Integer.parseInt(req.getParameter(null));
        //int ques_id = Integer.parseInt
        int q_marks = Integer.parseInt(req.getParameter("marks"));

        Exam_QuestionDaoImple eqd = Exam_QuestionDaoImple();
        Arr
        return null;
    }
}
