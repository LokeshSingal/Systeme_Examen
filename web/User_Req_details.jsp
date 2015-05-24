<%-- 
    Document   : User_Req_details
    Created on : 24 May, 2015, 7:44:06 PM
    Author     : Kishan
--%>

<%@page import="com.system.examination.model.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    Login l=new Login();
    
      User_info user =new User_info();
%>
<%
    l=(Login)request.getSession().getAttribute("User");
    user=(User_info) request.getAttribute("userP");
%>