<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Kishan Ajudiya | Home</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
    <!-- Bootstrap 3.3.4 -->
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
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
            Dashboard
            <small>Control panel</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Dashboard</li>
          </ol>
        </section>


        <!-- Code of middel part -->
      
        <div class="row" style="margin-left:70px;margin-top:25px ">
            <div class="col-lg-4 col-xs-6">
              <!-- small box -->
              <div class="small-box bg-blue">
                <div class="inner">
                  <h3>150</h3>
                  <p>Total Number Of Tests</p>
                </div>
                <div class="icon">
                  <i class="ion ion-ios-paper-outline"></i>
                </div>
                
              </div>
            </div><!-- ./col -->
            <div class="col-lg-4 col-xs-6" style="margin-left:50px">
              <!-- small box -->
              <div class="small-box bg-maroon">
                <div class="inner">
                  <h3>53<sup style="font-size: 20px">%</sup></h3>
                  <p>Total Attempted Test</p>
                </div>
                <div class="icon">
                  <i class="ion ion-android-checkmark-circle"></i>
                </div>
                
              </div>
              </div><!-- ./col -->
            
        </div>
        <div class="row" style="margin-left:70px">
            <div class="col-lg-4 col-xs-6">
              <!-- small box -->
              <div class="small-box bg-red">
                <div class="inner">
                  <h3>735</h3>
                  <p>Your Rank</p>
                </div>
                <div class="icon">
                  <i class="ion ion-android-contacts"></i>
                </div>
               
              </div>
            </div><!-- ./col -->
            <div class="col-lg-4 col-xs-6" style="margin-left:50px">
              <!-- small box -->
              <div class="small-box bg-green">
                <div class="inner">
                  <h3>53<sup style="font-size: 20px">%</sup></h3>
                  <p>Your Total Score</p>
                </div>
                <div class="icon">
                  <i class="ion ion-steam"></i>
                </div>
                
              </div>
              </div><!-- ./col -->
            
        </div>
        <div class="row" style="margin-left:70px">
            
              <div class="col-lg-4 col-xs-6">
              <!-- small box -->
              <div class="small-box bg-yellow">
                <div class="inner">
                  <h3>44</h3>
                  <p>User Info</p>
                </div>
                <div class="icon">
                  <i class="ion ion-person-add"></i>
                </div>
               <a href="Controllor?action=profile" class="small-box-footer">More info <i class="fa fa-arrow-circle-right"></i></a>
              </div>
            </div><!-- ./col -->
            <div class="col-lg-4 col-xs-6" style="margin-left:50px">
              <!-- small box -->
              <div class="small-box bg-navy">
                <div class="inner">
                  <h3>65</h3>
                  <p>Give Exam</p>
                </div>
                <div class="icon">
                  <i class="ion ion-ios-copy"></i>
                </div>
                <a href="Controllor?action=exam_home" class="small-box-footer">More info <i class="fa fa-arrow-circle-right"></i></a>
              </div>
            </div><!-- ./col -->
            
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

    <!-- jQuery 2.1.4 -->
    <%@include file="Main_include_js.jsp" %>
  </body>
</html>