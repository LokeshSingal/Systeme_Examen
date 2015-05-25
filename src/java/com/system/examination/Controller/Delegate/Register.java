<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.LoginDaoImple;
import com.system.examination.DaoImplementaion.User_InfoDaoImple;
import com.system.examination.model.Login;
import com.system.examination.model.User_info;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class Register implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        try {
              String f_name,email,pwd,edu,ins,gen;
            f_name=req.getParameter("full_name");
            email=req.getParameter("email");
            pwd=req.getParameter("password");
            edu=req.getParameter("education");
            ins=req.getParameter("institute");
            gen=req.getParameter("gender");
              Login l=new Login();
            l.setUser_username(f_name);
            l.setUser_email(email);
            l.setUser_password(pwd);
            l.setPri_Admin(0);
            l.setPri_Instructor(0);
            l.setPri_Student(1);
            LoginDaoImple ld=new LoginDaoImple();
            if(ld.insert(l))
            {
            User_info u=new User_info();
            u.setUser_id(ld.getUserByEmail(email).getUser_id());
            u.setGender(gen);
            u.setInstitute_name(ins);
            u.setProgram(edu);
            u.setName(f_name);
            User_InfoDaoImple ud=new User_InfoDaoImple();
            
            if(ud.insert(u))
            {
            req.getSession().setAttribute("User", l);
            req.getSession().setAttribute("userp", ud);
            return "Dashbord.jsp";
            }
            }          
        } catch (Exception e) {
            req.setAttribute("error", e.toString()+"Register");
            return "LoginFail.jsp";
        }
        return "Register.jsp";
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.LoginDaoImple;
import com.system.examination.DaoImplementaion.User_InfoDaoImple;
import com.system.examination.model.Login;
import com.system.examination.model.User_info;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class Register implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        try {
              String f_name,email,pwd,edu,ins,gen;
            f_name=req.getParameter("full_name");
            email=req.getParameter("email");
            pwd=req.getParameter("password");
            edu=req.getParameter("education");
            ins=req.getParameter("institute");
            gen=req.getParameter("gender");
              Login l=new Login();
            l.setUser_username(f_name);
            l.setUser_email(email);
            l.setUser_password(pwd);
            l.setPri_Admin(0);
            l.setPri_Instructor(0);
            l.setPri_Student(1);
            LoginDaoImple ld=new LoginDaoImple();
            if(ld.insert(l))
            {
            User_info u=new User_info();
            u.setUser_id(ld.getUserByEmail(email).getUser_id());
            u.setGender(gen);
            u.setInstitute_name(ins);
            u.setProgram(edu);
            u.setName(f_name);
            User_InfoDaoImple ud=new User_InfoDaoImple();
            
            if(ud.insert(u))
            {
            req.getSession().setAttribute("User", l);
            req.getSession().setAttribute("userp", ud);
            return "Dashbord.jsp";
            }
            }          
        } catch (Exception e) {
            req.setAttribute("error", e.toString()+"Register");
            return "LoginFail.jsp";
        }
        return "Register.jsp";
    }
    
}
>>>>>>> da6d8d8c909c53b96c24fb1fe2e98e325abe61e0
