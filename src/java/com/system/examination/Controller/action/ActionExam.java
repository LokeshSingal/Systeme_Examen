/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.action;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.Exam_ListDaoImple;
import com.system.examination.model.Exam_list;
import com.system.examination.model.Login;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
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
        
        
        String s3 ="03:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        long ms = sdf.parse(s3).getTime();
        java.util.Date d=new java.util.Date(req.getParameter("exam_date"));
       
        Time duration =new Time(ms);
        
        Date declare_date =new Date(d.getYear(), d.getMonth(),d.getDate() );
        int Show_instant_result=1;
         if(req.getParameter("show_result").equals("Y"))
              Show_instant_result =1;
         if(req.getParameter("show_result").equals("N"))
              Show_instant_result =0;
         
        int total_marks = Integer.parseInt(req.getParameter("total_marks"));
        String exam_username = req.getParameter("exam_name");
        String exam_password = req.getParameter("exam_password");
        exam.setExam_title(exam_title);
        exam.setDeclare_date(declare_date);
        exam.setDuration(duration);
        exam.setExam_desc(exam_desc);
        exam.setExam_password(exam_password);
        exam.setExam_username(exam_username);
        Login l=(Login) req.getSession().getAttribute("User");
        exam.setInstructor_id(l.getUser_id());
        exam.setNo_of_ques(no_of_ques);
        exam.setShow_instant_result(Show_instant_result);
        exam.setTotal_marks(total_marks);
        return exam;
    }
    
    protected void putExamRequest(HttpServletRequest req,HttpServletResponse resp) throws ClassNotFoundException, SQLException{
        
        Exam_ListDaoImple ed = new Exam_ListDaoImple();
        ArrayList<Exam_list> exam_detail = ed.getAll();
        req.setAttribute("exam_detail", exam_detail);
    }

}
