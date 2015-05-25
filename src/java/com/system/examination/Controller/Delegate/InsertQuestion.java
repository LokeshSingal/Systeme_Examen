<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.ActionQuestionBank;
import com.system.examination.DaoImplementaion.Question_BankDaoImple;
import com.system.examination.model.Login;
import com.system.examination.model.Question_Bank;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class InsertQuestion extends ActionQuestionBank{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        String theAction=req.getParameter("action");
        if(theAction.equals("add_question"))
        {
            try {
                Login l=(Login) req.getSession().getAttribute("User");
                Question_Bank q=getQuestionObjectRequest(req, res);
                q.setCourse_id("IT615");
                
               //System.out.println(q.getLevel()+q.getQuestion()+q.getSolution()+q.getOptionA()+q.getOptionB()+q.getOptionC()+q.getOptionD());
               // if(q!=null)
                //{
                Question_BankDaoImple qb=new Question_BankDaoImple();
                System.out.println(l.getUser_id());
                //q.setCourse_id("IT615");
                //q.setInstructor_id(l.getUser_id());
                    
                    qb.insert(q);
                  if(1>0)
                {
                    putQuestionRequest(req, res);
                   return "QuestionBank.jsp";
                }
               // }
                //else
                  //  return "AddQuestion.jsp";
            } catch (Exception ex) {
                req.setAttribute("error", ex+"AddQuestion");
                
            } 
            
        }
        return "LoginFail.jsp";
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.ActionQuestionBank;
import com.system.examination.DaoImplementaion.Question_BankDaoImple;
import com.system.examination.model.Login;
import com.system.examination.model.Question_Bank;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class InsertQuestion extends ActionQuestionBank{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        String theAction=req.getParameter("action");
        if(theAction.equals("add_question"))
        {
            try {
                Login l=(Login) req.getSession().getAttribute("User");
                Question_Bank q=getQuestionObjectRequest(req, res);
                q.setCourse_id("IT615");
                
               //System.out.println(q.getLevel()+q.getQuestion()+q.getSolution()+q.getOptionA()+q.getOptionB()+q.getOptionC()+q.getOptionD());
               // if(q!=null)
                //{
                Question_BankDaoImple qb=new Question_BankDaoImple();
                System.out.println(l.getUser_id());
                //q.setCourse_id("IT615");
                //q.setInstructor_id(l.getUser_id());
                    
                    qb.insert(q);
                  if(1>0)
                {
                    putQuestionRequest(req, res);
                   return "QuestionBank.jsp";
                }
               // }
                //else
                  //  return "AddQuestion.jsp";
            } catch (Exception ex) {
                req.setAttribute("error", ex+"AddQuestion");
                
            } 
            
        }
        return "LoginFail.jsp";
    }
    
}
>>>>>>> da6d8d8c909c53b96c24fb1fe2e98e325abe61e0
