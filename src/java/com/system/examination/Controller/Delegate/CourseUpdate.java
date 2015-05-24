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
public class CourseUpdate extends ActionCourse {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        
        String view = "Course.jsp";
         Course course = getCourseObjectRequest(req, res);
         
        try
        {
            CourseDaoImple course_db = new CourseDaoImple();
            
            course_db.update(course);
        }
        catch(Exception e)
        {
             req.setAttribute("error", e.toString() + "[CourseUpdate.java]");
            return "error.jsp";
        }
        
        return view;
        
    }
    
}
