/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.ActionQuestionBank;
import com.system.examination.DaoImplementaion.Question_BankDaoImple;
import com.system.examination.model.Question_Bank;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
