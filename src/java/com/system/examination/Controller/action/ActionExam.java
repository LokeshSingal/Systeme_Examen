/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.action;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.Exam_ListDaoImple;
import com.system.examination.model.Exam_list;
<<<<<<< HEAD
import com.system.examination.model.Login;
=======
>>>>>>> da6d8d8c909c53b96c24fb1fe2e98e325abe61e0
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
<<<<<<< HEAD
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
=======
>>>>>>> da6d8d8c909c53b96c24fb1fe2e98e325abe61e0
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
<<<<<<< HEAD
        
        
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
=======
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

>>>>>>> da6d8d8c909c53b96c24fb1fe2e98e325abe61e0
        return exam;
    }
    
    protected void putExamRequest(HttpServletRequest req,HttpServletResponse resp) throws ClassNotFoundException, SQLException{
        
        Exam_ListDaoImple ed = new Exam_ListDaoImple();
        ArrayList<Exam_list> exam_detail = ed.getAll();
        req.setAttribute("exam_detail", exam_detail);
    }

}
