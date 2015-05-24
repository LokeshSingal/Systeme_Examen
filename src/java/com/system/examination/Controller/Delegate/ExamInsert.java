/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;
import com.system.examination.Controller.Action;
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
public class ExamInsert implements Action {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        
                if(req.getParameter("action").equals("create_new_exam"))
                {
                    Exam_list el=null;
                    ArrayList<Exam_Questions> eq=null;
                    ArrayList<Question_Bank> exam_question=null;
                    req.setAttribute("exam", el);
                    req.setAttribute("exam_question", eq);
                    try{
                    Question_BankDaoImple qd=new Question_BankDaoImple();
                    ArrayList<Question_Bank> qb=qd.getAll();
                      //  System.out.println(qb.get(0).getQuestion());
                    req.setAttribute("exam_questions_detail",qd.getAll());
                    }catch(Exception e){System.out.println(e);}
                    return "CreateExam.jsp";
                }
                return "Exam_Home.jsp";
    }
    
}
