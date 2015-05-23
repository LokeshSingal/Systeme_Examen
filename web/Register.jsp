<%-- 
    Document   : Logindemo
    Created on : 18 May, 2015, 3:49:41 AM
    Author     : Kishan
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
    <div class="register-box" >
      <div class="register-logo">
        <a href="#"><b>Systme </b>Examen</a>
      </div><!-- /.login-logo -->
      <div class="register-box-body">
        <p class="login-box-msg">Register a new membership</p>
        <form action="GeneralController" method="post" data-toggle="validator">
            <input type="hidden" name="action" value="register">
                    <div class="form-group has-feedback">
                        <input type="text" class="form-control" id="name" name="full_name" placeholder="Full name" required/>
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
              <input type="email" class="form-control" id="email"  name="email" placeholder="Email" required>
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
              <input type="password" class="form-control" id="password" name="password" placeholder="Password" required/>
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
              <input type="password" class="form-control" data-match="#password" placeholder="Retype password" required />
            <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
          </div>
            <div class="help-block with-errors"></div>
          <div class="form-group has-feedback">
              <input type="text" class="form-control" id="education" name="education" placeholder="Education" required/>
            <span class="glyphicon glyphicon-bookmark form-control-feedback"></span>
          </div>
             <div class="form-group has-feedback">
                 <input type="text" class="form-control" id="institute" name="institute" placeholder="Institute"/>
            <span class="glyphicon glyphicon-tower form-control-feedback"></span>
          </div>
          <div class="row">
            <div class="col-xs-8">    
              <div class="checkbox icheck">
                <label>
                  <input type="checkbox"> I agree to the <a href="#">terms</a>
                </label>
              </div>                        
            </div><!-- /.col -->
            <div class="col-xs-4">
              <button type="submit" class="btn btn-primary btn-block btn-flat">Register</button>
            </div><!-- /.col -->
          </div>
        </form>

       

         <a href="Controllor?action=login" class="text-center">I already have a membership</a>

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
