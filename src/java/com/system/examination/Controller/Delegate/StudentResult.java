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
public class StudentResult extends ActionResult {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {

        if (req.getParameter("action").equals("studentresult")) {
           
             try {

                putResultById(req, res);
                return "StudentViewResult.jsp";

            } catch (Exception e) {
                System.out.println(e);
            }

            return "StudentViewResult.jsp";
        }
        if (req.getParameter("action").equals("student_view_exam_result")) {
           
        }

        return "StudentViewExamResult.jsp";
    }

}
