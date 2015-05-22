/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.action;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.LoginDaoImple;
import com.system.examination.model.Login;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public abstract class ActionLogin implements Action {
    
     protected Login getLoginObjectRequest(HttpServletRequest req, HttpServletResponse resp){
     
         Login login = new Login();
         String username = req.getParameter("username");
         String password = req.getParameter("password");
         String email = req.getParameter("email");
         int isAdmin = Integer.parseInt(req.getParameter("isAdmin"));
         int isinstructor = Integer.parseInt(req.getParameter("isInstructor"));
         int isStudent = Integer.parseInt(req.getParameter("isStudent"));
         
         login.setUser_username(username);
         login.setUser_password(password);
         login.setUser_email(email);
         login.setPri_Admin(isAdmin);
         login.setPri_Instructor(isinstructor);
         login.setPri_Student(isStudent);
                 
         
         return login;
     }
     
     protected void putLoginRequest(HttpServletRequest req,HttpServletResponse resp) throws Exception
     {
         LoginDaoImple login = new LoginDaoImple();
         ArrayList<Login> login_details = login.getAll();
         req.setAttribute("login_details", login_details);
         
     }
    
    
    
}
