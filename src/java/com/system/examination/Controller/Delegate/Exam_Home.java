/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.Exam_ListDaoImple;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public class Exam_Home implements Action {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        try
        {
            Exam_ListDaoImple ld=new Exam_ListDaoImple();
            req.setAttribute("Exams",ld.getAll());
        }catch(Exception e)
                {
                    System.out.println(e);
                }
        String view = "Exam_Home.jsp";
        return view;
    }
    
    
    
}
