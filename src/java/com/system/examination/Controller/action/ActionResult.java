/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.Controller.action;

import com.system.examination.Controller.Action;
import com.system.examination.DaoImplementaion.ResultDaoImple;
import com.system.examination.model.Result;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lokesh
 */
public abstract class ActionResult implements Action {

    protected Result getResultObjectRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Result result = new Result();

        //int R_id;
        int R_user_id = Integer.parseInt(req.getParameter(null));
        int R_exam_id = Integer.parseInt(req.getParameter(null));
        //Date R_Date = 
        int Score = Integer.parseInt(req.getParameter(null));
        
        return null;

    }
    
    protected void putResultRequest(HttpServletRequest req,HttpServletResponse resp) throws Exception
    {
        ResultDaoImple rd = new ResultDaoImple();
        ArrayList<Result> result = rd.getAll();
        req.setAttribute("result", result);
    }
    
}
