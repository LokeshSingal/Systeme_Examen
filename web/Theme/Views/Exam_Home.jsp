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
      <jsp:include page="Left-side_User_Menu.jsp" flush="true" />
      
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
                <a href="Controllor?action=create_exam" class="small-box-footer">
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
                      <th>Exam Description</th>
                      <th>Number of Questions</th>
                      <th>Exam Date</th>
                      <th>Utility</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for(int i=0;i<=5;i++) 
                                { 
                        %>
                      <tr>
                        <td>183</td>
                      <td>Java</td>
                      <td>60</td>
                      <td>11/6/2015</td>
                      <td><div class="box-body">
                   <a class="btn btn-app" href="Controllor?action=update_exam">
                    <i class="fa fa-edit" style="transform:translate(0px, -10px)" ></i> Edit
                  </a>
                 <a class="btn btn-app" data-toggle="modal" href="#myModal1<%= i %>">
                    <i class="fa fa-trash" style="transform:translate(0px, -10px)"></i> Delete
                  </a>
                  <a class="btn btn-app" data-toggle="modal" href="#myModal<%= i %>">
                    <i class="fa fa-eye" style="transform:translate(0px, -10px)"></i> View
                  </a>
                  <a class="btn btn-app" href="Controllor?action=exam_preview">
                    <i class="fa fa-play" style="transform:translate(0px, -10px)"></i> Preview
                  </a>
                </div><!-- /.box-body --></td>
                      </tr>
                 
<div class="modal fade" id="myModal<%= i %>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Decs :</b> </label>
          dfsadfasfd
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Decs :</b> </label>
          dfsadfasfd
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Decs :</b> </label>
          dfsadfasfd
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Decs :</b> </label>
          dfsadfasfd
          </div>
          <div class="row" style="padding-left: 40px;padding-top: 10px;padding-right: 10px">
          <label style="color:#fff; font-size:large;  width: 30%; background-color: rgb(108, 171, 227); height: 30px; text-align: right;" class="skin-blue"><b>Decs :</b> </label>
          dfsadfasfd
          </div>
          </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
        
      </div>
    </div>
  </div>
</div>
                    
   <div class="modal fade" id="myModal1<%= i %>" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Delete</h4>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
          <form action="Controllor?action=detete_exam" method="post" >
              <input type="hidden" name="test_id" value=" value of exam id">
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
                      <th>Exam Description</th>
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
