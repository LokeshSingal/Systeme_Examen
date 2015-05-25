package com.system.examination.Controller;

import java.io.IOException;
import java.util.Properties;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.system.examination.util.ObjectCreator;

public class Controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

       //  System.out.print("123456");
        String theAction = request.getParameter("action");
        
        
        Action action = getActionFromConfig( theAction );
        System.out.println(theAction);
        System.out.println(action);
        String view = action.execute(request, response);
        
        RequestDispatcher rd = request.getRequestDispatcher(view);
        rd.forward(request, response);    
        
    } 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    private Action getActionFromConfig( String theAction ) 
            throws ServletException, IOException{
        
        Properties map = new Properties();
        map.load( this.getClass().getClassLoader().getResourceAsStream( ACTION_MAPPING ));
        System.out.println("123456");
        String action_class = map.getProperty( 
                theAction.toLowerCase() );    
        System.out.println(action_class);
        Action action = (Action) ObjectCreator
                .createObject(action_class);
        
        return action;
    }

    private final static String ACTION_MAPPING = "com/system/examination/Controller/ActionMapping.properties"; 

}
