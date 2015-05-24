/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.*;
import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.CourseDaoImple;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public class CourseDelete extends ActionCourse {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        
        String view = "Course.jsp";
        String c_id = req.getParameter("course_id");
        
        try{
            CourseDaoImple course_db = new CourseDaoImple();
        
        course_db.delete(c_id);
        
        }
        catch(Exception e)
        {
            req.setAttribute("error", e.toString() + "[CourseDelete.java]");
            return "error.jsp";
                }
        
        return view;
    }
    
}
