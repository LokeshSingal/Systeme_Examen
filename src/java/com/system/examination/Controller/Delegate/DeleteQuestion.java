<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.ActionQuestionBank;
import com.system.examination.DaoImplementaion.Question_BankDaoImple;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class DeleteQuestion extends ActionQuestionBank{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        try
        {
            String id=req.getParameter("q_id");
            Question_BankDaoImple qd=new Question_BankDaoImple();
            qd.delete(id);
            putQuestionRequest(req, res);
        }catch(Exception E)
        {
            System.out.println(E);
        }
        return "QuestionBank.jsp";
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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class DeleteQuestion extends ActionQuestionBank{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        try
        {
            String id=req.getParameter("q_id");
            Question_BankDaoImple qd=new Question_BankDaoImple();
            qd.delete(id);
            putQuestionRequest(req, res);
        }catch(Exception E)
        {
            System.out.println(E);
        }
        return "QuestionBank.jsp";
    }
    
}
>>>>>>> da6d8d8c909c53b96c24fb1fe2e98e325abe61e0
