/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.ActionQuestionBank;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class Question_bank extends ActionQuestionBank{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        
        try {
            putQuestionRequest(req, res);
        } catch (Exception ex) {
            System.out.println(ex);
        } 
        return "QuestionBank.jsp";
    }
    
}
