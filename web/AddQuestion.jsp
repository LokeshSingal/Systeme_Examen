<%-- 
    Document   : AddQuestion.html
    Created on : 20 May, 2015, 1:59:32 AM
    Author     : lokesh
--%>
<%@page import="java.util.ArrayList"%>
<%@include file="User_Req_details.jsp" %>

<%
    ArrayList<Course> c1=(ArrayList<Course>)request.getAttribute("courses");
    Question_Bank q=(Question_Bank) request.getAttribute("question");
    if(q==null)
    {
        q=new Question_Bank();
        //out.println(q.getOptionA());
        System.out.println(q.getOptionA());
    }
%>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Kishan Ajudiya | Home</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.4 -->
     <%@include file="Head_css.jsp" %>
     <script src="Theme/plugins/jQuery/jQuery-2.1.4.min.js"></script>
     <script src="validator.js"></script>
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
            Add Question
            <small>Control panel</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="controllor?action=dashbord"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="controllor?action=question_bank">Question Bank</a></li>
            <li class="active">Add Question</li>
          </ol>
        </section>


        <!-- Code of middel part -->
      
        <form role="form" data-toggle="validator" action="Controller" method="post">
      <div class="box box-primary" style="margin-left:40px;width: 70%; margin-top: 20px" >
                <div class="box-header">
                  <h3 class="box-title">Question Detail</h3>
                </div><!-- /.box-header -->
                <!-- form start -->
                
                  <div class="box-body" >
                    <div class="form-group" required>
                      <label>Course</label>
                      <select class="form-control" name="course" id="course" required>
                          <%for(Course c:c1){ 
                          if(c.getCourseID()==q.getCourse_id()){ %>
                          <option selected><%= c.getCourseID() %></option>
                          <% } else { %>
                          <option selected><%= c.getCourseID() %></option>
                          <% }} %>
                      </select>
                    </div>
                    <div class="form-group">
                      <label>Level</label>
                      <select class="form-control" id="level" name="level" required>
                          <option>Easy</option>
                          <option>Medium</option>
                          <option>Hard</option>
                      </select>
                    </div>
                  <div class='box box-info collapsed-box' style="margin-left: 0px">
                <div class='box-header'>
                  <h3 class='box-title'>Question Description</h3>
                  <!-- tools box -->
                  <div class="pull-right box-tools">
                    <button class="btn btn-info btn-sm" data-widget='collapse' data-toggle="tooltip" title="Collapse"><i class="fa fa-plus"></i></button>
                    
                  </div><!-- /. tools -->
                </div><!-- /.box-header -->
                <div class='box-body pad'>
                  
                    <textarea class="form-control" id="ques_desc" name="ques_desc" rows="10" cols="80">
                     <%=q.getQ_desc() %>                       
                    </textarea>
                  
                </div>
              </div>
                    <div class="form-group">
                      <label>Question</label>
                      <textarea class="form-control" id="ques" name="ques" rows="3" placeholder="Question"  required><%=q.getQuestion() %></textarea>
                    </div>
                    <div class="form-group">
                      <label>Option A</label>
                      <textarea class="form-control" id="optionA" rows="3" name="optionA" placeholder="Option A"  required><%=q.getOptionA() %></textarea>
                    </div>
                    <div class="form-group">
                      <label>Option B</label>
                      <textarea class="form-control" id="optionB" rows="3" name="optionB" placeholder="OptionB" required><%=q.getOptionB() %></textarea>
                    </div>
                    <div class="form-group">
                      <label>Option C</label>
                      <textarea class="form-control" id="optionC" rows="3" name="optionC" placeholder="OptionC"  ><%=q.getOptionC() %></textarea>
                    </div>
                    <div class="form-group">
                      <label>Option D</label>
                      <textarea class="form-control" id="optionD" rows="3" name="optionD" placeholder="OptionD"  ><%=q.getOptionD() %></textarea>
                    </div>
                    <div class="form-group">
                      <label>Solution</label>
                      <select class="form-control" id="solution" name="solution" required>
                          <option>A</option>
                          <option>B</option>
                          <option>C</option>
                          <option>D</option>
                      </select>
                    </div>
                      
                      
                   
                  </div><!-- /.form group -->
                 
                  <div class="box-footer">
                     <% if(q.getQues_id()==0){ %>
                    <button type="submit" class="btn btn-primary pull-right">Add Qustion</button>
                    <input type="hidden" name="action" value="add_question">
                    <% } 
                     else{
                    %>
                    <button type="submit" class="btn btn-primary pull-right">Update Qustion</button>
                    <input type="hidden" name="action" value="update_question">
                    <input type="hidden" name="q_id" value="<%=q.getQues_id() %>">
                    <% } %>
                  </div>
                  </div>
                  </div>
      </div>
        
                </form>
             


<script type="text/javascript">
      $(function () {
        // Replace the <textarea id="editor1"> with a CKEditor
        // instance, using default configuration.
        CKEDITOR.replace('ques_desc');
        //bootstrap WYSIHTML5 - text editor
        $(".textarea").wysihtml5();
      });
    </script>

 

      <!-- /Code of middel part -->



        <!-- Main content -->
      <!-- /.content-wrapper -->

      </div>
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

 <%@include file="Footer.jsp" %> 
      <%@include file="Main_include_js.jsp" %>
   

  </body>
</html>