

<aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
          <!-- Sidebar user panel -->
          <div class="user-panel">
            <div class="pull-left image">
              <img src="user_photo.jpeg" class="img-circle" alt="User Image" />
            </div>
            <div class="pull-left info">
                <p><%=l.getUser_username()%></p>
              <p><%=l.getUser_email()%></p>
               </div>
          </div>
          <!-- search form -->
          
          <!-- /.search form -->
          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="sidebar-menu">
            <li class="header">NAVIGATIONS</li>
            
             
              
                <li>
                  <a href="Controllor?action=dashbord">
                    <i class="glyphicon glyphicon-dashboard"></i><span> Dashboard</span></a>
                  </li>
              <li>
                <a href="Controllor?action=profile">
                  <i class="glyphicon glyphicon-user"></i><span> Profile</span>
                </a></li>
            
            <li>
              <a href="Controllor?action=exam_home">
                <i class="fa fa-book"></i> <span>Exam</span> 
              </a>
            </li>
            <li>
                <a href="Controllor?action=result">
                  <i class="fa fa-check"></i><span> Result</span>
                </a>
            </li>
            <li>
                <a href="Controllor?action=question_bank">
                  <i class="fa fa-university"></i><span> Question Bank</span>
                </a>
            </li>
            <li>
                <a href="Controllor?action=import">
                  <i class="fa fa-reply"></i><span> Import</span>
                </a>
            </li>
            <li>
                <a href="Controllor?action=export">
                  <i class="fa fa-share"></i><span> Export</span>
                </a>
            </li>
            <li>
                <a href="Controllor?action=logout">
                  <i class="fa fa-power-off"></i><span>Logout</span>
                </a>
            </li>
            
          </ul>
        </section>
        <!-- /.sidebar -->
      </aside>