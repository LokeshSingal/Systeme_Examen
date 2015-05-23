<%-- 
    Document   : Privilege.jsp
    Created on : 21 May, 2015, 9:19:58 PM
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
            <li class="active">Dashboard</li>
          </ol>
        </section>


        <!-- Code of middel part -->
                    
        <div class="row" style="margin-left: 50px;margin-top: 20px">
        <form role="form" action="Controllor?action=user_privilege" method="post">
        <div class="col-xs-12">
              <div class="box">
                <div class="box-header">
                  <h3 class="box-title">Exam List</h3>
                  
                </div><!-- /.box-header -->
                <div class="box-body table-responsive no-padding">
                <table id="example1" class="table table-bordered table-striped">
                    <thead>
                      <tr>
                        <th>ID</th>
                      <th>User Name</th>
                      <th>Admin</th>
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
                          Kishan Ajudiya
                      </td>
                      <td>
                      <input type="checkbox">
                      </td>
                      <td>
                      <input type="checkbox">
                      </td>
                      <td>
                          <input type="checkbox">                          
                      </td>
                      </tr>
                 
                  
                      
                      
                      <% } %>
                    </tbody>
                    <tfoot>
                      <tr>
                        <th>ID</th>
                      <th>Exam Description</th>
                      <th>Admin</th>
                      <th>Instructor</th>
                      <th>Student</th>
                        </tr>
                    </tfoot>
                  </table>
                 </div><!-- /.box-body -->
              </div><!-- /.box -->
            </div>


</form>
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

