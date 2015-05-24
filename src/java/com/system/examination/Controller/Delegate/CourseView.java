/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.ActionCourse;
import com.system.examination.DaoImplementaion.CourseDaoImple;
import com.system.examination.model.Course;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public class CourseView extends ActionCourse {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {

        String view = "Course.jsp";
        String action = req.getParameter("action");

        if (action.equals("addcourse")) {

            try {

                CourseDaoImple Course_db = new CourseDaoImple();
                Course course = getCourseObjectRequest(req, res);
                Course_db.insert(course);
                putCourseRequest(req, res);
                action = "course";

            } catch (Exception e) {
                req.setAttribute("error", e.toString() + "[Course.java]");
                return "error.jsp";
            }

        } else if (action.equals("updatecourse")) {
           
            Course course = getCourseObjectRequest(req, res);

            try {
                CourseDaoImple course_db = new CourseDaoImple();

                course_db.update(course);
                putCourseRequest(req, res);
                action="course";
                
            } catch (Exception e) {
                req.setAttribute("error", e.toString() + "[Course.java]");
                return "error.jsp";
            }
        } else if (action.equals("deletecourse")) {

            String c_id = req.getParameter("course_id");

            try {
                CourseDaoImple course_db = new CourseDaoImple();

                course_db.delete(c_id);
                putCourseRequest(req, res);
                action = "course";
            } catch (Exception e) {
                req.setAttribute("error", e.toString() + "[Course.java]");
                return "error.jsp";
            }
        } else if (action.equals("course")) {
            try {

                putCourseRequest(req, res);

            } catch (Exception e) {
                req.setAttribute("error", e.toString() + "[Course.java]");
                return "error.jsp";
            }
        }

        return view;
    }

}
