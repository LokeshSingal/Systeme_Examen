<%-- 
    Document   : newjspAdd_Question to test.jsp
    Created on : 20 May, 2015, 2:03:40 AM
    Author     : lokesh
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.system.examination.model.Question_Bank"%>
<!DOCTYPE html>
<%
 ArrayList<Question_Bank> aq=(ArrayList<Question_Bank>)request.getAttribute("exam_questions_detail");
 %>
            <div class="box box-primary" style="width:100%;margin-left: 7px">
                <div class="box-header">
                  <h3 class="box-title">Add Questions</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <table id="example1" class="table table-bordered table-striped">
                    <thead>
                      <tr>
                         <th>Sr. No.</th>
                        <th>Question</th>
                        <th>Answer</th>
                        <th>Course</th>
                        <th>Marks</th>
                        <th>Add </th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                         int i=1;
                        for(Question_Bank q:aq)
                        {
                           %>
                      <tr>
                          <td><%=i%></td>
                          <td><%=q.getQuestion()%></td>
                          <td><%=q.getSolution()%></td>
                          <td><%=q.getCourse_id()%></td>
                          <td><input type="text" name="marks" id="marks"></td>
                        <td><div class="form-group">
                            <label>
                                
                                <input type="checkbox" class="flat-red" id="qid" name="qid" value="<%=q.getQues_id()%>" />
                            
                            </label>
                                
                            &nbsp;&nbsp;&nbsp;Add
                            </div>
                        </td>
                      </tr>
                      <%
                      i++;
                        }
                      %>
                    </tbody>
                    <tfoot>
                      <tr>
                          <th>Sr. No.</th>
                        <th>Question</th>
                        <th>Answer</th>
                        <th>Course</th>
                        <th>Marks</th>
                        <th>Add </th>
                        </tr>
                    </tfoot>
                  </table>
                </div><!-- /.box-body -->
              </div><!-- /.box -->
              
              
 <div class="box-footer" >
     <a href="#tab_3" data-toggle="tab"> <button  type="button" class="btn btn-primary pull-right">Next</button></a>
                    
                  </div>

