/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.User_InfoDaoImple;
import com.system.examination.model.Login;
import com.system.examination.model.User_info;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public class Profile implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        String view = "Profile.jsp";
       Login l=new Login();
        l=(Login)req.getSession().getAttribute("User");
    
        int user_id = l.getUser_id();
        String theAction = req.getParameter("action");
        
      
        User_info userP = null;
        
        try {
            User_InfoDaoImple user_db = new User_InfoDaoImple();
             userP = user_db.findByID(user_id);
        }
        catch(Exception e) {
            req.setAttribute("error", e);
            return "error.jsp";
        }
        
        req.setAttribute("userP", userP);

        return view;

    }
    
    
}
