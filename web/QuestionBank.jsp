<%-- 
    Document   : QuestionBank.jsp
    Created on : 20 May, 2015, 1:33:02 AM
    Author     : lokesh
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.system.examination.model.*"%>
<%@include file="User_Req_details.jsp" %>
<%
ArrayList<Question_Bank> a=(ArrayList<Question_Bank>)request.getAttribute("All_Questions");
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Kishan Ajudiya | Home</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.4 -->
   <%@include file="Head_css.jsp" %>
   
   
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
            Question Bank
            <small>Control panel</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Question Bank</li>
          </ol>
        </section>


        <!-- Code of middel part -->
        <div class="row" style="margin-left: 40px;margin-top: 20px">
            
        <div class="col-lg-30 col-xs-6" >
              <!-- small box -->
              <div class="small-box bg-aqua-active">
                <div class="inner">
                  <h2>Create</h2>
                  <h2>Question</h2>               
                </div>
                <div class="icon">
                  <i class="glyphicon glyphicon-edit"></i>
                </div>
                <a href="Controller?action=create_new_question" class="small-box-footer">
                  Proceed <i class="fa fa-arrow-circle-right"></i>
                </a>
              </div>
            </div>
              
               <!-- Table -->

         <div class="col-xs-12">
            <div class="box box-primary">
                <div class="box-header">
                  <h3 class="box-title">List of Questions</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <table id="example1" class="table table-bordered table-striped">
                    <thead>
                      <tr>
                         <th>Sr. No.</th>
                        <th>Question</th>
                        <th>Answer</th>
                        <th>Course</th>
                        <th>Utility </th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                        int i=1;
                        for(Question_Bank q:a)
                        
                        {
                        %>
                      <tr>
                          <td><%=i%></td>
                        <td><%=q.getQuestion() %></td>
                        <td><% if(q.getSolution().equals("A")) out.print(q.getOptionA());
                               if(q.getSolution().equals("B")) out.print(q.getOptionB());
                               if(q.getSolution().equals("C")) out.print(q.getOptionC());
                               if(q.getSolution().equals("D")) out.print(q.getOptionD());%></td>
                        <td><%=q.getCourse_id() %></td>
                        
                        <td>
                            <div class="box-body">
                                <a class="btn btn-app" href="Controller?action=edit_question&q_id=<%=q.getQues_id() %>" >
                    <i class="fa fa-edit" style="transform:translate(0px, -10px)" ></i> Edit
                  </a>
                                <a class="btn btn-app" data-toggle="modal" href="#myModal1<%=q.getQues_id() %>">
                    <i class="fa fa-trash" style="transform:translate(0px, -10px)"></i> Delete
                  </a>
                  <a class="btn btn-app" data-toggle="modal" href="#myModal<%=q.getQues_id() %>">
                    <i class="fa fa-eye" style="transform:translate(0px, -10px)"></i> View
                  </a>
                </div><!-- /.box-body --></td>
                       
                      </tr>
                      
   <div class="modal fade" id="myModal<%=q.getQues_id() %>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Question Description :</b> </label>
          <%=q.getQ_desc() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Question :</b> </label>
          <%=q.getQuestion() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Course :</b> </label>
          <%=q.getCourse_id() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Option A :</b> </label>
          <%=q.getOptionA() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Option B :</b> </label>
          <%=q.getOptionB() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Option C :</b> </label>
          <%=q.getOptionC() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Option D :</b> </label>
          <%=q.getOptionD() %>
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Solution :</b> </label>
          <%=q.getSolution() %>
          </div>
          
          </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
        
      </div>
    </div>
  </div>
</div>
                    
   <div class="modal fade" id="myModal1<%=q.getQues_id() %>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Delete</h4>
      </div>
      <div class="modal-body">
          Do you want to delete <%=q.getQuestion() %>??????
      </div>
      <div class="modal-footer">
          <form action="Controller?action=detete_question" method="post" >
              <input type="hidden" name="q_id" value="<%=q.getQues_id() %>">
        <button type="button" class="btn btn-default" data-dismiss="modal">No</button>
        <button type="submit" class="btn btn-primary">Yes</button>
          </form>
      </div>
    </div>
  </div>
</div>                 
 <% i++; } %>                     
                    </tbody>
                    <tfoot>
                      <tr>
                          <th>Sr. No.</th>
                        <th>Question</th>
                        <th>Answer</th>
                        <th>Course</th>
                        <th>Add </th>
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
   

  </body>
</html>