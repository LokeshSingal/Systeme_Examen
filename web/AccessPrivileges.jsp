<%-- 
    Document   : AccessPrivileges.jsp
    Created on : 22 May, 2015, 4:49:06 AM
    Author     : lokesh
--%>

<!DOCTYPE html>
<html>
  <head>
    
    <title>Kishan Ajudiya | Home</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.4 -->
    <%@include file="Head_css.jsp" %>
    <script src="Theme/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
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
            Access Privilege
            <small>Control panel</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Access Privilege</li>
          </ol>
        </section>


        <!-- Code of middel part -->
                    

        <form role="form" action="Controllor?action=action_privilege" method="post">
<div class="row" style="margin-left: 40px;margin-top: 20px">
              <div class="box" >
                <div class="box-header">
                  <h3 class="box-title">Update Privileges</h3>
                  
                </div><!-- /.box-header -->
                <div class="box-body table-responsive no-padding">
                <table id="example1" class="table table-bordered table-striped">
                    <thead>
                      <tr>
                        <th>Sr. No.</th>
                      <th>Requests</th>
                      <th>Instructor</th>
                      <th>Student</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for(int i=0;i<=5;i++) 
                                { 
                        %>
                      <tr>
                        <td>183</td>
                      <td>
                          Requests
                      </td>
                      <td>
                      <input type="checkbox" id="student_pre" name="student_pre">
                      </td>
                      <td>
                          <input type="checkbox" id="instructor_pre" name="instructor_pre">                          
                      </td>
                      </tr>
                 
                  
                      
                      
                      <% } %>
                    </tbody>
                    <tfoot>
                      <tr>
                        <th>ID</th>
                      <th>Requests</th>
                      <th>Instructor</th>
                      <th>Student</th>
                        </tr>
                    </tfoot>
                  </table>
                    <br>
                    <br>
                    <div >
                    <button type="submit" class="btn btn-primary btn-primary pull-right">Update</button>
                  </div>
                   
                 </div><!-- /.box-body -->
                  
              </div><!-- /.box -->
            </div>


</form>

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

