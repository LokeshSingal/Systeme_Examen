<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.*;
import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.LoginDaoImple;
import com.system.examination.model.Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class ShowLoginForm implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        String view = "Login.jsp";
        return view;
        
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.*;
import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.LoginDaoImple;
import com.system.examination.model.Login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class ShowLoginForm implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        String view = "Login.jsp";
        return view;
        
    }
    
}
>>>>>>> da6d8d8c909c53b96c24fb1fe2e98e325abe61e0
