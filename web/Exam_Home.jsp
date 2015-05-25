<%@page import="java.util.ArrayList"%>
<%@page import="com.system.examination.model.Login"%>
<%@include file="User_Req_details.jsp" %>
<%
ArrayList<Exam_list> el=(ArrayList<Exam_list>) request.getAttribute("Exams");
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Kishan Ajudiya | Home</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
   
    <%@include file="Head_css.jsp" %>
   
  </head>
  <body class="skin-blue sidebar-mini">
    <div class="wrapper">
      
   <%@include file="Header.jsp" %>
      <!-- Left side column. contains the logo and sidebar -->
    

      <!-- Code of left side user panel -->
      
      <%@include file="Left-side_User_Menu.jsp"  %>
      
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
            <li class="active">Exam</li>
          </ol>
        </section>
        <!-- Code of middel part -->
        
        <div class="col-lg-30 col-xs-6" >
              <!-- small box -->
              <div class="small-box bg-aqua-active">
                <div class="inner">
                  <h2>Create</h2>
                  <h2>Exam</h2>               
                </div>
                <div class="icon">
                  <i class="glyphicon glyphicon-edit"></i>
                </div>
                <a href="Controller?action=create_new_exam" class="small-box-footer">
                  Proceed <i class="fa fa-arrow-circle-right"></i>
                </a>
              </div>
            </div>
            <!-- Table -->
            <div class="row" style="margin-left: 40px;margin-top: 20px">
            <div class="col-xs-12">
              <div class="box">
                <div class="box-header">
                  <h3 class="box-title">Exam List</h3>
                  
                </div><!-- /.box-header -->
                <div class="box-body table-responsive no-padding">
                <table id="exam_list" class="table table-bordered table-striped">
                    <thead>
                      <tr>
                        <th>ID</th>
                      <th>Exam Title</th>
                      <th>Number of Questions</th>
                      <th>Exam Date</th>
                      <th>Utility</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for(Exam_list e:el) 
                                { 
                        %>
                      <tr>
                        <td><%=e.getExam_id()%></td>
                      <td><%=e.getExam_title()%></td>
                      <td><%=e.getNo_of_ques()%></td>
                      <td><%=e.getDeclare_date()%></td>
                      <td><div class="box-body">
                     <a class="btn btn-app" href="Controller?action=edit_exam&e_id=<%=e.getExam_id()%>">
                    <i class="fa fa-edit" style="transform:translate(0px, -10px)" ></i> Edit
                  </a>
                 <a class="btn btn-app" data-toggle="modal" href="#myModal1<%=e.getExam_id() %>">
                    <i class="fa fa-trash" style="transform:translate(0px, -10px)"></i> Delete
                  </a>
                  <a class="btn btn-app" data-toggle="modal" href="#myModal<%=e.getExam_id() %>">
                    <i class="fa fa-eye" style="transform:translate(0px, -10px)"></i> View
                  </a>
                  <a class="btn btn-app" href="Controller?action=exam_preview&e_id=<%=e.getExam_id()%>">
                    <i class="fa fa-play" style="transform:translate(0px, -10px)"></i> Preview
                  </a>
                </div><!-- /.box-body --></td>
                      </tr>
                 
<div class="modal fade" id="myModal<%=e.getExam_id() %>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Title :</b> </label>
          <%=e.getExam_title() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Description :</b> </label>
          <%=e.getExam_desc() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>No of Questions :</b> </label>
          <%=e.getNo_of_ques() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Duration :</b> </label>
          <%=e.getDuration() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Declare date :</b> </label>
          <%=e.getDeclare_date() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Total Marks :</b> </label>
          <%=e.getTotal_marks()%>
          </div>
          </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
        
      </div>
    </div>
  </div>
</div>
                    
   <div class="modal fade" id="myModal1<%=e.getExam_id() %>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Delete</h4>
      </div>
      <div class="modal-body">
          Do you want to delete<b> <%=e.getExam_title()%></b>??????????
      </div>
      <div class="modal-footer">
          <form action="Controller" method="post" >
              <input type="hidden" name="action" value="delete_exam">
              <input type="hidden" name="test_id" value="<%=e.getExam_id()%>">
        <button type="button" class="btn btn-default" data-dismiss="modal">No</button>
        <button type="submit" class="btn btn-primary">Yes</button>
          </form>
      </div>
    </div>
  </div>
</div>                 

                      
                      
                      
                      <% } %>
                    </tbody>
                    <tfoot>
                      <tr>
                        <th>ID</th>
                      <th>Exam Title</th>
                      <th>Number of Questions</th>
                      <th>Exam Date</th>
                      <th>Utility</th>
                        </tr>
                    </tfoot>
                  </table>
                 </div><!-- /.box-body -->
              </div><!-- /.box -->
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
    <script type="text/javascript">
      $(function () {
        $("#exam_list").dataTable();
        $('#example2').dataTable({
          "bPaginate": true,
          "bLengthChange": false,
          "bFilter": false,
          "bSort": true,
          "bInfo": true,
          "bAutoWidth": false
        });
      });
    </script>
  </body>
</html>
