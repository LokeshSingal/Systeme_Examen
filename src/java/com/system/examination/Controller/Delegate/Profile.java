/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.Action;
import com.system.examination.Controller.action.ActionUser;
import com.system.examination.DaoImplementaion.LoginDaoImple;
import com.system.examination.DaoImplementaion.User_InfoDaoImple;
import com.system.examination.model.Login;
import com.system.examination.model.User_info;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public class Profile extends ActionUser {

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        String view = "Profile.jsp";
        
        String action = req.getParameter("action");
        
        Login l=new Login();
        l=(Login)req.getSession().getAttribute("User");
    
        int user_id = l.getUser_id();
       
        
      
        User_info userP = null;
       if(action.equals("updateprofile") )
       {
           userP = getUser_infoObjectRequest(req, res);
           String username = req.getParameter("username");
           String password = req.getParameter("new_password");
           String email = req.getParameter("email");
           
           Login login = new Login();
           login.setUser_email(email);
           login.setUser_password(password);
           login.setUser_username(username);
           
            try {
               User_InfoDaoImple user_db = new User_InfoDaoImple();
               user_db.update(userP);
                LoginDaoImple login_db = new LoginDaoImple();
                login_db.update(login);
               
                action = "profile";
           } catch (Exception e) {
           }
           
           
       }
       else if(action.equals("profile"))
       {
        try {
            User_InfoDaoImple user_db = new User_InfoDaoImple();
             userP = user_db.findByID(user_id);
        }
        catch(Exception e) {
            req.setAttribute("error", e);
            return "error.jsp";
        }   
       }
        
        
        req.setAttribute("userP", userP);

        return view;

    }
    
    
}
