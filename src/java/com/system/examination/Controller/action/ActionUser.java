/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.action;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.User_InfoDaoImple;
import com.system.examination.model.User_info;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public abstract class ActionUser implements Action {
    
     protected User_info getUser_infoObjectRequest(HttpServletRequest req, HttpServletResponse resp){
        
         
        String email = req.getParameter("email");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
       // String image = req.getParameter("image");
        String institute = req.getParameter("institute");
        String program = req.getParameter("program");
        String gender = req.getParameter("sex");
        
        
        User_info user = new User_info();
        
       
        user.setName(name);
       // user.setImage(image);
        user.setInstitute_name(institute);
        user.setProgram(program);
        user.setGender(gender);
        
        
        return user;

    }

    protected void putUserRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        User_InfoDaoImple user_db = new User_InfoDaoImple();
        ArrayList<User_info> userinfo = user_db.getAll();
        req.setAttribute("userinfo", userinfo);
    }
}
