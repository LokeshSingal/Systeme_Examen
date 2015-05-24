/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.ActionResult;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public class InstructorResult extends ActionResult{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        
          if(req.getParameter("action").equals("instructorresult"))
        {
            return "InstructorViewResult.jsp";
        }
          if(req.getParameter("action").equals("instructor_view_exam_result"))
          {
              return "InstructorViewExamResult.jsp";
          }
          
          return "InstructorViewResult.jsp";
    }
    
}
