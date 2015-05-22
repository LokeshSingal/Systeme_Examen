/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.Controller.Delegate;

import com.system.examination.Controller.action.*;
import com.system.examination.Controller.Action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kishan
 */
public class ShowLoginForm implements Action{

    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) {
        String view = "Logindemo.jsp";

        return view;
        
    }
    
}
