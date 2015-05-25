/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.Delegate;

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
        
        if(req.getParameter("action").equals("profile"))
        {
            return "Profile.jsp";
        }
        if(req.getParameter("action").equals("updateuser"))
        {
            Login l=(Login)req.getSession().getAttribute("User");
            User_info u1=getUser_infoObjectRequest(req, res);
            u1.setUser_id(l.getUser_id());
            try{
                User_InfoDaoImple ud=new User_InfoDaoImple();
                if(ud.update(u1))
                {
                    req.getSession().setAttribute("userP", u1);
                     return "Profile.jsp";
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        if(req.getParameter("action").equals("updatelogin"))
        {
           Login l=(Login)req.getSession().getAttribute("User");
            //User_info u1=getUser_infoObjectRequest(req, res);
            //u1.setUser_id(l.getUser_id());
            try{
                Login l1=new Login();
                l1.setUser_username(req.getParameter("username"));
                l1.setUser_password(req.getParameter("password"));
                l1.setUser_email(req.getParameter("email"));
                l1.setUser_id(l.getUser_id());
                LoginDaoImple ld=new LoginDaoImple();
                if(ld.update(l1))
                {
                    req.getSession().setAttribute("User", l1);
                     return "Profile.jsp";
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        
        return "Profile.jsp";
        

    }
    
    
}
