<%-- 
    Document   : Thankyou.jsp
    Created on : 22 May, 2015, 3:28:50 AM
    Author     : lokesh
--%>

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
                        Result
                        <small>Control panel</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Dashboard</li>
                    </ol>
                </section>


                <!-- Code of middel part -->

                <div class="row" style="margin-top: 20px;margin-left: 40px">
                    <div class="box box-primary" >
                        <div class="box-header">
                            <div class="box-body">
                                <label class="" style="color: #005384;font-size: 30px"> 
                                    Your Score
                                </label>
                                <br>
                                <br>
                                <br>
                                <label class="" style="color: #478500 ;font-size: 60px"> 
                                    Thank You...
                                </label>
                                </body>
                            </div>
                        </div>
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

