<%-- 
    Document   : ExamInstruction.jsp
    Created on : 22 May, 2015, 5:25:16 PM
    Author     : lokesh
--%>

<!DOCTYPE html>
<html>
  <head>
    
    <title>Kishan Ajudiya | Home</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.4 -->
    <%@include file="Head_css.jsp" %>
    <script src="../plugins/jQuery/jQuery-2.1.4.min.js"></script>
   
     <script src="validator.js"></script>
    
  </head>
  <body class="skin-blue sidebar-mini">
    <div class="wrapper">
      
      <%@include file="Header.jsp" %>
      <!-- Left side column. contains the logo and sidebar -->
    

      <!-- Code of left side user panel -->
      

      <%@include file="Left-side_User_Menu.jsp" %>


      <!-- /Code of left side user panel -->


      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            Exam
            <small>Control panel</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Profile</li>
          </ol>
        </section>


        <!-- Code of middel part -->
        
        
        

            <div class="row" style="margin-top: 20px;margin-left: 40px">
            
                <div class="col-md-6" >
                    <div class="box box-primary">
                        <div class="box-header">
                        <h3>Instructions</h3>
                        </div>
                        <div class="box-body">
                        Injnrkjfwkfnkwfnwkejfnewkfjnk
                        </div>
                    </div>
            
        
            
        </div>
            
            <!-- Update Column -->
        <div class="col-md-5">
            
        <div class="box box-primary" style="margin-top: 70px">
            <div class="box-header">
                
                <h2 class="page-header">Exam Login</h2>
            </div>
            <div class="box-body">
                
                <form role="form" data-toggle="validator" action="Controllor?action=exam_login" method="post">
                      <div class="form-group">
                      <label>Exam ID</label>
                      <input type="text" class="form-control" id="exam_id" name="exam_id" placeholder="Exam ID" required/>
                    </div>
                    <div class="form-group">
                      <label>Password</label>
                      <input type="text" class="form-control" id="exam_password" name="exam_password" placeholder="Password" required/>
                    </div>
                    
                    
                  <div >
                    <button type="submit" class="btn btn-primary btn-primary pull-right">Login</button>
                  </div>
                    
                    
                    
                   
                   
                      </form>
                </div>
            
            </div>
            
        </div>
            
            <!-- /Update Column -->
            
        </div>
           
      <!-- /Code of middel part -->


    
  
        <!-- Main content -->
      </div><!-- /.content-wrapper -->


<%@include file="Footer.jsp" %> 
      
      
      <!-- @#@#@ Control Sidebar -->      
      <aside class="control-sidebar control-sidebar-dark">                
 
      </aside><!-- /.control-sidebar -->
     
      <div class='control-sidebar-bg'></div>
    </div><!-- ./wrapper -->
<%@include file="Main_include_js.jsp" %>
    
  </body>
</html>`

