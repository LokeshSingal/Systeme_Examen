<%-- 
    Document   : Course.jsp
    Created on : 22 May, 2015, 4:44:03 PM
    Author     : lokesh
--%>
<%@page import="com.system.examination.model.Course"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.system.examination.model.Login"%>
<% 
    Login l=new Login();
    l=(Login)request.getSession().getAttribute("User");
    
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title><%=l.getUser_username()%> | Home</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.4 -->
    <%@include file="Head_css.jsp" %>
    <script src="Theme/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <link href="validator.js"> 
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
            Course
            <small>Control panel</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Course</li>
          </ol>
        </section>


        <!-- Code of middel part -->
        <%
        ArrayList<Course> list = (ArrayList<Course>)request.getAttribute("courselist");
        
        
        %>
            
         
            <div class="row" style="margin-left: 170px;margin-top: 20px">
              <div class="box box-primary" style="width:70%">
                 <div class="box-header">
                     <h4>Course List</h4>
                    </div>
                <div class="box-body table-responsive no-padding">
                  <table id="example1" class="table table-bordered table-striped">
                    <thead>
                      <tr>
                       <th>Course ID</th>
                      <th>Course Name</th>
                      <th>Description</th>
                      <th style="width: 210px">Utility</th>
                        </tr>
                    </thead>
                    <tbody>
                      
                          <% for(Course crs : list )
                          {%>
                          <tr>
                            <td><%=crs.getCourseID()%></td>
                            <td><%=crs.getCourseName()%></td>
                            <td><%=crs.getCourseDesc()%></td>
                              <td><div class="box-body">
                  <a class="btn btn-app" data-toggle="modal" href="#myModal<%=crs.getCourseID()%>">
                    <i class="fa fa-eye" style="transform:translate(0px, -10px)"></i> View
                  </a>
                  <a class="btn btn-app" data-toggle="modal" href="#myModal12<%=crs.getCourseID()%>">
                    <i class="fa fa-edit" style="transform:translate(0px, -10px)" ></i> Edit
                  </a>
                  <a class="btn btn-app" data-toggle="modal" href="#myModal1<%=crs.getCourseID()%>">
                    <i class="fa fa-trash" style="transform:translate(0px, -10px)" ></i> Delete
                  </a>
                </div><!-- /.box-body --></td>   
                                </tr>
                         
                       
                                     
                    
                      
<div class="modal fade" id="myModal<%=crs.getCourseID()%>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b> Course ID ~ </b> </label>
          <%=crs.getCourseID()%>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b> Course Name ~  </b> </label>
          <%=crs.getCourseName()%>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b> Course Description ~ </b> </label>
          <%=crs.getCourseDesc()%>
          </div>
         
          </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
        
      </div>
    </div>
  </div>
</div>
                    
<div class="modal fade" id="myModal12<%=crs.getCourseID()%>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
          
      <div class="box-body">
                      <form role="form" data-toggle="validator" action="Controller?action=updatecourse" method="post">
                      <div class="form-group">
                      <label>Course ID</label>
                      <input type="text" class="form-control" id="course_id" name="course_id" placeholder="Course ID" value="<%=crs.getCourseID()%>" required/>
                    </div>
                    <div class="form-group">
                      <label>Course Name</label>
                      <input type="text" class="form-control" id="course_name" name="course_name" placeholder="Course Name" value="<%=crs.getCourseName()%>" required/>
                    </div>
                    
                    
                    <div class="form-group">
                      <label>Course Description</label>
                      <input type="text" class="form-control" id="course_desc" name="course_desc" placeholder="Description" value="<%=crs.getCourseDesc()%>" required/>
                    </div>
                    
                  <div >
                    <button type="submit" class="btn btn-primary btn-primary pull-right">Update</button>
                  </div>
                      </form>
                  
                  </div>    
          
      
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
        
      </div>
    </div>
  </div>
</div>

                    
   <div class="modal fade" id="myModal1<%=crs.getCourseID()%>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Delete</h4>
      </div>
      <div class="modal-body">
          Do You Want to delete <b><%=crs.getCourseName()%></b> ?
      </div>
      <div class="modal-footer">
          <form action="Controller?action=deletecourse" method="post" >
              <input type="hidden" name="course_id" value="<%=crs.getCourseID()%>">
        <button type="button" class="btn btn-default" data-dismiss="modal">No</button>
        <button type="submit" class="btn btn-primary">Yes</button>
          </form>
      </div>
    </div>
  </div>
</div>                 

                      <%
                                    }
                          %> 
                      
                      
                    </tbody>
                    <tfoot>
                      <tr>
                    
                       <th>Course ID</th>
                      <th>Course Name</th>
                      <th>Description</th>
                      <th>Utility</th>
                        </tr>
                    </tfoot>
                  </table>
                  
                </div><!-- /.box-body -->
              </div><!-- /.box -->
           
            <div class="box box-primary" style="width: 70%">
                <div class="box-header">
                    <h3> Add Course</h3>
                    </div>
                <div class="box-body">
                      <form role="form" data-toggle="validator" action="Controller?action=addcourse" method="post">
                      <div class="form-group">
                      <label>Course ID</label>
                      <input type="text" class="form-control" id="course_id" name="course_id" placeholder="Course ID" required/>
                    </div>
                    <div class="form-group">
                      <label>Course Name</label>
                      <input type="text" class="form-control" id="course_name" name="course_name" placeholder="Course Name" required/>
                    </div>
                    
                    
                    <div class="form-group">
                      <label>Course Description</label>
                      <input type="text" class="form-control" id="course_desc" name="course_desc" placeholder="Description" required/>
                    </div>
                    
                  <div >
                    <button type="submit" class="btn btn-primary btn-primary pull-right">Add</button>
                  </div>
                      </form>
                  
                  </div><!-- /.box-body -->
                  
                
              </div>
        </div>



      <!-- /Code of middel part -->

        <!-- Main content -->
      </div><!-- /.content-wrapper -->

      
      <%@include file="Footer.jsp" %> 
      <!-- @#@#@ Control Sidebar -->      
      <aside class="control-sidebar control-sidebar-dark">                
        <!-- Create the tabs -->

        <!-- Right Side Setting Menu -->






        
        <!-- /Right Side Setting Menu -->
        
      </aside><!-- /.control-sidebar -->
      <!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
      <div class='control-sidebar-bg'></div>
    </div><!-- ./wrapper -->

       <%@include file="Main_include_js.jsp" %>
  </body>
</html>



