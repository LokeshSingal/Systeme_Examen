<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Kishan Ajudiya | Home</title>
    <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>
   
    <%@include file="Head_css.jsp" %>
    
    
   <link href="../plugins/iCheck/all.css" rel="stylesheet" type="text/css" />
   <script src="../plugins/iCheck/icheck.js"></script>
  
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
            Question
            <small>Question Number</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Dashboard</li>
          </ol>
        </section>
        <!-- Code of middel part -->
       <form action="#" method="get">
        <div class="row">
            <div class="col-lg-8" style="margin-left: 70px; margin-top: 50px">
                <div class="box box-info">
                    <div class="box-header with-border">
                        <i class="fa fa-question"></i>
                        <h3 class="box-title">Question Descreption</h3>
                    </div>
                    <div class="box-body">
                        
                    </div>
                </div>
                <div class="box box-info">
                    <div class="box-header with-border">
                        <i class="fa fa-question"></i>
                        <h3 class="box-title">Question???</h3>
                    </div>
                    <div class="box-body">
                        
                    </div>
                    <div class="box-footer">
                        <button type="submit" class="btn btn-primary" id="btnPre"><i class="fa fa-arrow-circle-left"></i>Previous</button>
                        <button type="submit" class="btn btn-primary pull-right" id="btnNxt">Next<i class="fa fa-arrow-circle-right"></i></button>
                
                    </div>
                </div>
                
            </div>
            <div class="col-lg-3" style=" margin-top: 50px">
               
                 <div class="box box-danger">
                <div class="box-header">
                  <h3 class="box-title">Timer</h3>
                </div>
                <div class="box-body">
                  
                  <!-- radio -->
                
                </div><!-- /.box-body -->
               
              </div>
              
                
                <div class="box box-success">
                <div class="box-header">
                  <h3 class="box-title">Answers</h3>
                </div>
                <div class="box-body">
                  
                  <!-- radio -->
                  <div class="form-group" id="r1">
                    <div class="btn-group btn-group-sm" data-toggle="buttons">
                        
                     <label id="a" class="btn btn-primary" for="test2_t" >
                         <input type="radio" name="test2" id="r1" value="a"/> A
                     </label>
                        <br>
                        <br>
                        <label id="b" class="btn btn-primary" for="test2_t" >   
                      <input type="radio" name="test2" id="r2" value="b"/> B
                     </label>
                        <br>
                        <br>
                        <label id="c" class="btn btn-primary" for="test2_t" >
                      <input type="radio" name="test2" id="r3" value="c"/> C
                     </label>
                        <br>
                        <br>
                      <label id="d" class="btn btn-primary" for="test2_f" >
                     <input  type="radio" name="test2" id="r4" value="d"/> D
                    </label>
</div>
                  </div>
                </div><!-- /.box-body -->
              
              </div>
            </div>
            
        </div>
           
         </form>
        <div class="row">
            <div class="col-lg-9" style="margin-left: 70px">
                <div class="box box-primary">
                <div class="box-header">
                  <h3 class="box-title">Question</h3>
                  <button class="btn btn-warning btn-sm" id="flag">Flag</button>
                  <button class="btn btn-danger btn-sm" id="uncheck">Uncheck</button>
                </div>
                <div class="box-body">
        
                    
                   <span id="qu" data-toggle="tooltip" title="Attemted" class='badge bg-red'>3</span>
                   
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
            <script src="../plugins/iCheck/icheck.min.js" type="text/javascript"></script>
    <script>
        
        
            $('input[type=radio]').change( function() {
                if($(this).val()=="a")
                {
                    $("#"+$(this).val()).removeClass("btn-primary");
                    $("#"+$(this).val()).toggleClass("btn-success");
                    $("#b").addClass("btn-primary");$("#b").removeClass("btn-success");
                    $("#c").addClass("btn-primary");$("#c").removeClass("btn-success");
                    $("#d").addClass("btn-primary");$("#d").removeClass("btn-success");
                  }
                  if($(this).val()=="b")
                {
                    $("#"+$(this).val()).removeClass("btn-primary");
                    $("#"+$(this).val()).toggleClass("btn-success");
                    $("#a").addClass("btn-primary");$("#a").removeClass("btn-success");
                    $("#c").addClass("btn-primary");$("#c").removeClass("btn-success");
                    $("#d").addClass("btn-primary");$("#d").removeClass("btn-success");
                  }
                  if($(this).val()=="c")
                {
                    $("#"+$(this).val()).removeClass("btn-primary");
                    $("#"+$(this).val()).toggleClass("btn-success");
                    $("#b").addClass("btn-primary");$("#b").removeClass("btn-success");
                    $("#a").addClass("btn-primary");$("#a").removeClass("btn-success");
                    $("#d").addClass("btn-primary");$("#d").removeClass("btn-success");
                  }
                  if($(this).val()=="d")
                {
                    $("#"+$(this).val()).removeClass("btn-primary");
                    $("#"+$(this).val()).toggleClass("btn-success");
                    $("#b").addClass("btn-primary");$("#b").removeClass("btn-success");
                    $("#c").addClass("btn-primary");$("#c").removeClass("btn-success");
                    $("#a").addClass("btn-primary");$("#a").removeClass("btn-success");
                  }
                
            
                });
        
        
       $('input[type=radio]').change( function() {
        if ( $('#qu').hasClass('bg-red') || $('#qu').hasClass('bg-orange') )
        {
        $("#qu").removeClass("bg-red");$("#qu").removeClass("bg-orange");
        $("#qu").toggleClass("bg-green");
        }
      });
    $("#flag").click(function() {
        if ( $('#qu').hasClass('bg-red') || $('#qu').hasClass('bg-green') )
        {
        $("#qu").removeClass("bg-red");$("#qu").removeClass("bg-green");
        $("#qu").toggleClass("bg-orange");
        }
    });
    $("#uncheck").click(function() {
        if ( $('#qu').hasClass('bg-orange') || $('#qu').hasClass('bg-green') )
        {
        $("#qu").removeClass("bg-orange");$("#qu").removeClass("bg-green");
        $("#qu").toggleClass("bg-red");
       
       $("input:radio").attr("checked", false);
                    $("#b").addClass("btn-primary");$("#b").removeClass("btn-success");
                    $("#a").addClass("btn-primary");$("#a").removeClass("btn-success");
                    $("#d").addClass("btn-primary");$("#d").removeClass("btn-success");
                    $("#c").addClass("btn-primary");$("#c").removeClass("btn-success");
        }
        
        
    });
        </script>
            
    
        
  </body>
</html>
