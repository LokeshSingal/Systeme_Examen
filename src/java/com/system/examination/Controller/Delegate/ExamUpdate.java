/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.*;
import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.Exam_ListDaoImple;
import com.system.examination.DaoImplementaion.Exam_QuestionDaoImple;
import com.system.examination.DaoImplementaion.Question_BankDaoImple;
import com.system.examination.model.Exam_Questions;
import com.system.examination.model.Exam_list;
import com.system.examination.model.Question_Bank;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public class ExamUpdate implements Action {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
       
        if(req.getParameter("action").equals("edit_exam"))
        {
            
             ArrayList<Exam_Questions> eq=null;
                  try{
                   Exam_list el=new Exam_list();
                   Exam_ListDaoImple ed=new Exam_ListDaoImple();
                   el=ed.findById(Integer.parseInt(req.getParameter("e_id")));
                    Question_BankDaoImple qd=new Question_BankDaoImple();
                    ArrayList<Question_Bank> qb=qd.getAll();
                    Exam_QuestioDaoImple eq_d=new Exam_QuestionDaoImple();
                    
                    req.setAttribute("exam_question",eq_d.getQuestionByExamId(el.getExam_id()));
                    req.setAttribute("exam", el);
                    req.setAttribute("exam_questions_detail",qd.getAll());
                    }catch(Exception e){System.out.println(e);}
                    return "CreateExam.jsp";
        }
        String view = "CreateExam.jsp";
       
       return view;
    }
    
}
