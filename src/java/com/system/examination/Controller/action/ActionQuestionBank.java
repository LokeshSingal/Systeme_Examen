/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.action;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.Question_BankDaoImple;
import com.system.examination.model.Question_Bank;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public abstract class ActionQuestionBank implements Action {

    
    protected Question_Bank getQuestionObjectRequest(HttpServletRequest req, HttpServletResponse resp){
    
        
     //int Ques_id=req.getParameter(null);
     //int Instructor_id;
     String Q_desc = req.getParameter("ques_desc");
     String Question =  req.getParameter("ques");
     String OptionA = req.getParameter("optionA");
     String OptionB = req.getParameter("optionB");
     String OptionC = req.getParameter("optionC");
     String OptionD = req.getParameter("optionD");
     String Solution = req.getParameter("solution");
     String Level = req.getParameter("level");
     String Course_id = req.getParameter("course");
     
        Question_Bank question = new Question_Bank();
        
        question.setCourse_id(Course_id);
        question.setLevel(Level);
        question.setQ_desc(Q_desc);
        question.setQuestion(Question);
        question.setOptionA(OptionA);
        question.setOptionB(OptionB);
        question.setOptionC(OptionC);
        question.setOptionD(OptionD);
        question.setSolution(Solution);
        
     
  
        return question;
    
    }
    
    protected void putQuestionRequest(HttpServletRequest req,HttpServletResponse resp) throws Exception
    {
        Question_BankDaoImple question = new Question_BankDaoImple();
        ArrayList<Question_Bank> ques = question.getAll();
        req.setAttribute("ques", ques);
    }
}
