/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.Action;
import com.system.examination.Controller.action.ActionCourse;
import com.system.examination.DaoImplementaion.CourseDaoImple;
import com.system.examination.model.Course;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public class CourseAdd extends ActionCourse {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse resp) {
       
         String view = "Course.jsp";
      
        try {
            CourseDaoImple Course_db = new CourseDaoImple();
            Course course = getCourseObjectRequest(req, resp);
            Course_db.insert(course);
            putCourseRequest(req, resp);
        }
        catch(Exception e) {
            req.setAttribute("error", e.toString() + "[CourseAdd.java]");
            return "error.jsp";
        }
        return view;
    }
    
    
}
