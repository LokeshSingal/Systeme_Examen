<%-- 
    Document   : ExamConfig
    Created on : 20 May, 2015, 2:52:50 AM
    Author     : lokesh
--%>

<!DOCTYPE html>

      <div class="box box-primary" style="width:100%;margin-left: 7px">
                <div class="box-header">
                  <h3 class="box-title">Exam Configuration</h3>
                </div><!-- /.box-header -->
                <!-- form start -->
               
                  <div class="box-body">
                    <div class="form-group">
                      <label>Set Exam Name</label>
                      <input type="text" value="<%=el.getExam_username()%>" class="form-control" id="exam_name" name="exam_name" placeholder="Exam name" required/>
                    </div>
                    <div class="form-group">
                      <label>Set Exam Password</label>
                      <input type="password" value="<%=el.getExam_password()%>" class="form-control" id="exam_password" name="exam_password" placeholder="Password" required/>
                    </div>
                    <div class="form-group">
                      <label>Show Result</label>
                      <br>
                      <input type="radio" name="show_result" value="Y" checked>Yes
                      &nbsp;&nbsp;&nbsp;
                      <input type="radio" name="show_result" value="N">No
                    
                    </div>

                  
                  </div><!-- /.box-body -->
                   <div class="box-footer">
                      <% if(el==null) {%>
                    <button type="submit" class="btn btn-success btn-lg pull-right">Create Exam</button>
                    <input type="hidden" name="action" value="insertexam">
                    <%} else { %>
                    <button type="submit" class="btn btn-success btn-lg pull-right">Update Exam</button>
                    <input type="hidden" name="action" value="updateexam">
                    <input type="hidden" name="exam_id" value="<%=el.getExam_id()%>">
                    <%}%>
                  </div>
                
              </div><!-- /.box -->

