/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.ActionQuestionBank;
import com.system.examination.DaoImplementaion.Question_BankDaoImple;
import com.system.examination.model.Question_Bank;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class UpdateQuestion extends ActionQuestionBank{

   
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        try {
            Question_BankDaoImple qd=new Question_BankDaoImple();
            if(req.getParameter("action").equals("edit_question"))
            {
            int id=Integer.parseInt(req.getParameter("q_id"));
            req.setAttribute("question",qd.findById(id));
            return "AddQuestion.jsp";
            }
            if(req.getParameter("action").equals("update_question"))
            {
            Question_Bank q=getQuestionObjectRequest(req, res);    
            qd.update(q);
            putQuestionRequest(req, res);
            return "QuestionBank.jsp";
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return "QuestionBank.jsp";
    }
    
    
}
