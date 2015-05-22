/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.action;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.Exam_ListDaoImple;
import com.system.examination.model.Exam_list;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public abstract class ActionExam implements Action {

    protected Exam_list getExamObjectRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {

        Exam_list exam = new Exam_list();

        //int exam_id;
        //int instructor_id;
        String exam_desc = req.getParameter("exam_desc");
        String exam_title = req.getParameter("exam_title");
        int no_of_ques = Integer.parseInt(req.getParameter("no_of_ques"));
        
        /************************************/
        String string = "January 2, 2010";
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        
        Date date = (Date) format.parse(string);
        System.out.println(date); // Sat Jan 02 00:00:00 GMT 2010
        /****************************************************/
        Time duration = (Time) format.parse(req.getParameter("time"));
        
        Date declare_date = (Date) format.parse(req.getParameter("exam_date"));
        
         int Show_instant_result = Integer.parseInt(req.getParameter("show_result"));
        int total_marks = Integer.parseInt(req.getParameter("total_marks"));
        String exam_username = req.getParameter("exam_name");
        String exam_password = req.getParameter("exam_password");

        return exam;
    }
    
    protected void putExamRequest(HttpServletRequest req,HttpServletResponse resp) throws ClassNotFoundException, SQLException{
        
        Exam_ListDaoImple ed = new Exam_ListDaoImple();
        ArrayList<Exam_list> exam_detail = ed.getAll();
        req.setAttribute("exam_detail", exam_detail);
    }

}
