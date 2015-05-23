<%-- 
    Document   : LoginFail.jsp
    Created on : 24 May, 2015, 1:00:03 AM
    Author     : lokesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Systme Examen | Register</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.4 -->
    <link href="Theme/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <!-- Font Awesome Icons -->
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <!-- Theme style -->
    <link href="Theme/dist/css/AdminLTE.min.css" rel="stylesheet" type="text/css" />
    <!-- iCheck -->
    <link href="Theme/plugins/iCheck/square/blue.css" rel="stylesheet" type="text/css" />
    <script src="validator.js"></script>
  </head>
  <body class="register-page">
    <div class="register-box" style="width: 700px;">
      <div class="register-logo">
        <a href="#"><b>Systme </b>Examen</a>
      </div><!-- /.login-logo -->
      <div class="register-box-body" >
        <p class="login-box-msg"> 404
Oops! Page not found.

We could not find the page you were looking for. Meanwhile, you </p>
        

       
        <label class="pull-right">
         <a href="Controllor?action=register" class="text-center">Register</a>    
         or
         <a href="Controllor?action=login" class="text-center">Login</a>
         </label>
      </div><!-- /.login-box-body -->
    </div><!-- /.login-box -->

    <!-- jQuery 2.1.4 -->
    <script src="Theme/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <!-- Bootstrap 3.3.2 JS -->
    <script src="Theme/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
    <!-- iCheck -->
    <script src="Theme/plugins/iCheck/icheck.min.js" type="text/javascript"></script>
    <script>
      $(function () {
        $('input').iCheck({
          checkboxClass: 'icheckbox_square-blue',
          radioClass: 'iradio_square-blue',
          increaseArea: '20%' // optional
        });
      });
    </script>
  </body>
</html>
