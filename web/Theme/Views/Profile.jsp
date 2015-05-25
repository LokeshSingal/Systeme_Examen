<%-- 
    Document   : Profile
    Created on : 21 May, 2015, 6:08:38 PM
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
            Profile
            <small>Control panel</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Profile</li>
          </ol>
        </section>


        <!-- Code of middel part -->
        
        
        

            <div class="row" style="margin-top: 30px">
            
                <div class="col-md-6" style="margin-left: 30px">
            
        <div class="box box-primary" style="margin-left: 10px;width: 90%">
            <div class="box-header">
                <h2 class="page-header">Profile</h2>
               </div> 
            <div class="box-body">
               
          <div class="row" style="margin-bottom: 30px">
              <img src="user_photo.jpeg" class="img-circle" style="margin-left: 120px; height: 200px;width: 200px;"  alt="User Image" />
            </div>
          
            <div class="row" style="margin-left: 10px;width: 90%">
              <div class="col-md-4"  style="text-align: right" >
                  <label  style="color: #007bb6;font-size: large;">Name </label> 
              </div>
                <div class="col-md-6">
                  <label style="text-align: left;font-size: large ">   Kishan Ajudiya </label>
              </div>

            </div>
          
          
          <div class="row" style="margin-left: 10px;width: 90%">
              <div class="col-md-4"  style="text-align: right" >
                  <label  style="color: #007bb6;font-size: large;">Gender </label> 
              </div>
                <div class="col-md-6">
                  <label style="text-align: left;font-size: large ">    Male </label>
              </div>

            </div>
          
          
          <div class="row" style="margin-left: 10px;width: 90%">
              <div class="col-md-4"  style="text-align: right" >
                  <label  style="color: #007bb6;font-size: large;">Education </label> 
              </div>
                <div class="col-md-6">
                  <label style="text-align: left;font-size: large ">  Msc IT </label>
              </div>

            </div>
          
          <div class="row" style="margin-left: 10px;width: 90%">
              <div class="col-md-4"  style="text-align: right" >
                  <label  style="color: #007bb6;font-size: large;">Institute </label> 
              </div>
                <div class="col-md-6">
                  <label style="text-align: left;font-size: large ">   DAIICT </label>
              </div>

            </div>
          
          <div class="row" style="margin-left: 10px;width: 90%">
              <div class="col-md-4"  style="text-align: right" >
                  <label  style="color: #007bb6;font-size: large;">Email </label> 
              </div>
                <div class="col-md-6">
                  <label style="text-align: left;font-size: large ">   123@gmail.com  </label>
              </div>

            </div>
            </div>
            </div>
            
        </div>
            
            <!-- Update Column -->
        <div class="col-md-5">
            
        <div class="box box-primary">
            <div class="box-header">
                
                <h2 class="page-header">Update</h2>
          <div class="row">
          
              <!-- Custom Tabs -->
              <div class="nav-tabs-custom" style="width: 90%;margin-left: 10px">
                <ul class="nav nav-tabs">
                  <li class="active"><a href="#tab_1" data-toggle="tab">Profile</a></li>
                  <li><a href="#tab_2" data-toggle="tab">Account</a></li>
                  
                  
                  </ul>
                  <div class="tab-content" >
                  <div class="tab-pane active" id="tab_1">
                      
                      
                    <div class="box box-primary" style="width:100%;margin-left: 7px">
                
                  <div class="box-body">
                      <form role="form" data-toggle="validator" action="Controllor?action=update_Profile" method="post">
                    <div class="form-group">
                      <label> Profile Picture</label>
                      <input type="file" class="form-control" id="profile_pic" name="profile_pic"/>
                    </div>
                    <div class="form-group">
                      <label> Name</label>
                      <input type="text" class="form-control" id="name" name="name" placeholder="Name" required/>
                    </div>
                      <div class="form-group" required>
                      <label>Gender</label>
                      <br>
                      <input type="radio" name="sex" value="M">Male
                      &nbsp;&nbsp;&nbsp;
                      <input type="radio" name="sex" value="F">Female
                    </div>
                    <div class="form-group">
                      <label>Education</label>
                      <input type="text" class="form-control" id="education" name="education" placeholder="Education Degree" required/>
                    </div>
                       <div class="form-group">
                      <label>Institute</label>
                      <input type="text" class="form-control" id="institute" name="institute" placeholder="Institute" required/>
                    </div>
                   <div >
                    <button type="submit" class="btn btn-primary btn-primary pull-right">Update</button>
                  </div>
                      </form>

                  
                  </div><!-- /.box-body -->
                  
                
              </div><!-- /.box -->
                  </div><!-- /.tab-pane -->
                  <div class="tab-pane" id="tab_2">
                   <div class="box box-primary" style="width:100%;margin-left: 7px">
                <div class="box-body">
                      <form role="form" data-toggle="validator" action="Controllor?action=update_Profile" method="post">
                      <div class="form-group">
                      <label>Username</label>
                      <input type="text" class="form-control" id="username" name="username" placeholder="Username" required/>
                    </div>
                    <div class="form-group">
                      <label>Old Password</label>
                      <input type="password" class="form-control" id="old_pwd" name="old_password" placeholder="Old Password" required/>
                    </div>
                    
                    
                    <div class="form-group">
                      <label>New Password</label>
                      <input type="password" class="form-control" id="new_pwd" name="new_password" placeholder="New Password" required/>
                    </div>
                    <span class="help-block">Minimum of 6 characters</span>
                    <div class="form-group">
                      
                      <input type="password" class="form-control" id="new_pwd_con" data-match="#new_pwd" data-match-error="Whoops, these don't match" name="password" placeholder="Confirn" required/>
                    </div>
                    <div class="help-block with-errors"></div>
                    <div class="form-group">
                      <label>Email</label>
                      <input type="email" class="form-control" id="email" name="email" placeholder="Enter ..." data-error="email address is invalid" required/>
                    </div>
                    <div class="help-block with-errors"></div>
                    <div >
                    <button type="submit" class="btn btn-primary btn-primary pull-right">Update</button>
                  </div>
                      </form>
                  
                  </div><!-- /.box-body -->
                  
                
              </div><!-- /.box -->
                  </div><!-- /.tab-pane -->
                </div><!-- /.tab-content -->
              </div><!-- nav-tabs-custom -->
            

               </div> 
            
                 
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
