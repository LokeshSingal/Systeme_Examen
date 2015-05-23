/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.action;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.SubmissionDaoImple;
import com.system.examination.model.Submission;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public abstract class ActionSubmission implements Action {
    
    
    
     protected Submission getSubmissionObjectRequest(HttpServletRequest req,HttpServletResponse resp) throws Exception
     {
        int R_id = Integer.getInteger(req.getParameter(""));
        int S_ques_id = Integer.parseInt(req.getParameter(""));
        String Submission = req.getParameter("");
        int Evaluation = Integer.parseInt(req.getParameter(""));
     
         Submission sub = new Submission();
         
         sub.setEvaluation(Evaluation);;
         sub.setR_id(R_id);
         sub.setS_ques_id(S_ques_id);
         sub.setSubmission(Submission);
         
         
         return sub;
     }
     
     protected void putSubmissionRequest(HttpServletRequest req,HttpServletResponse resp) throws Exception
     {
         SubmissionDaoImple sd = new SubmissionDaoImple();
         ArrayList<Submission> sub = sd.getAll();
         req.setAttribute("sub", sub);
     }
}
