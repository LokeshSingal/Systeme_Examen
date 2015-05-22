/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.action;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.CourseDaoImple;
import com.system.examination.model.Course;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public abstract class ActionCourse implements Action {

    protected Course getCourseObjectRequest(HttpServletRequest req, HttpServletResponse resp) {

        Course course = new Course();
        
     String C_id = req.getParameter("course_id");
     String C_name=req.getParameter("course_name");
     String C_desc=req.getParameter("course_desc");
     
     course.setCourseDesc(C_desc);
     course.setCourseID(C_id);
     course.setCourseName(C_name);

    return course ;

}
    
    protected void putCourseRequest(HttpServletRequest req,HttpServletResponse resp) throws SQLException, ClassNotFoundException
    {
        CourseDaoImple cd = new CourseDaoImple();
        ArrayList<Course> course = cd.getAll();
        req.setAttribute("course", course);
    }

}
