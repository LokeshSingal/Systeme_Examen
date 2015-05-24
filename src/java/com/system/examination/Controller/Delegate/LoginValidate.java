/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.Action;
import com.system.examination.Controller.action.*;
import com.system.examination.DaoImplementaion.LoginDaoImple;
import com.system.examination.DaoImplementaion.User_InfoDaoImple;
import com.system.examination.model.Login;
import com.system.examination.model.User_info;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class LoginValidate implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res){
       //System.out.println("sdas");
        try
        {
        LoginDaoImple ld=new LoginDaoImple();
        Login l=ld.getUserByEmail(req.getParameter("email"));
        if(l!=null)
        {
            System.out.println("in");
            if(l.getUser_password().equals(req.getParameter("password")))
                    {
                        req.getSession().setAttribute("User", l);
                        User_InfoDaoImple user_db = new User_InfoDaoImple();
                        User_info userP = user_db.findByID(l.getUser_id());
                        req.getSession().setAttribute("userP", userP);
                        return "Dashbord.jsp";
                    }
        }
        }
        catch(Exception e)
        {
            req.setAttribute("error", e.toString()+"LoginValidate");
            
        }
        
        return "LoginFail.jsp";
    }
    
}
