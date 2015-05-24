/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.ActionCourse;
import com.system.examination.DaoImplementaion.CourseDaoImple;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public class Course extends ActionCourse {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        
        
         String view = "Course.jsp";
         String action = req.getParameter("action");
         if(action.equals("addcourse"))
         {
             
        try {
            CourseDaoImple Course_db = new CourseDaoImple();
            com.system.examination.model.Course course = getCourseObjectRequest(req, res);
            Course_db.insert(course);
            putCourseRequest(req, res);
        }
        catch(Exception e) {
            req.setAttribute("error", e.toString() + "[Course.java]");
            return "error.jsp";
        }
        
        
         }
         
         else if(action.equals("updatecourse"))
         {
             com.system.examination.model.Course course = getCourseObjectRequest(req, res);
         
        try
        {
            CourseDaoImple course_db = new CourseDaoImple();
            
            course_db.update(course);
        }
        catch(Exception e)
        {
             req.setAttribute("error", e.toString() + "[Course.java]");
            return "error.jsp";
        }
         }
         else if(action.equals("deletecourse"))
         {
              String c_id = req.getParameter("course_id");
        
        try{
            CourseDaoImple course_db = new CourseDaoImple();
        
        course_db.delete(c_id);
        
        }
        catch(Exception e)
        {
            req.setAttribute("error", e.toString() + "[Course.java]");
            return "error.jsp";
                }
         }
         else if(action.equals("courseview"))
         {
             try
             {
             CourseDaoImple course_db = new CourseDaoImple();
             ArrayList<com.system.examination.model.Course> courselist = course_db.getAll();
             req.setAttribute("courselist", courselist);
             }
             catch(Exception e)
             {
                  req.setAttribute("error", e.toString() + "[Course.java]");
            return "error.jsp";
             }
         }
             
         
         return view;
    }
    
    
}
