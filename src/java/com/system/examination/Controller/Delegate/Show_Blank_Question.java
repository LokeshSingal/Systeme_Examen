/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.CourseDaoImple;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class Show_Blank_Question implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        ArrayList<Course> c1=new ArrayList<Course>();
        try{
            CourseDaoImple cd=new CourseDaoImple();
            c1=cd.getAll();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        req.setAttribute("question", null);
        req.setAttribute("courses",);
      return "AddQuestion.jsp";
    }
    
}
