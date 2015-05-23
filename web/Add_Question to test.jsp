<%-- 
    Document   : newjspAdd_Question to test.jsp
    Created on : 20 May, 2015, 2:03:40 AM
    Author     : lokesh
--%>

<!DOCTYPE html>

            <div class="box box-primary" style="width:100%;margin-left: 7px">
                <div class="box-header">
                  <h3 class="box-title">Add Questions</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
                  <table id="example1" class="table table-bordered table-striped">
                    <thead>
                      <tr>
                         <th>Sr. No.</th>
                        <th>Question Description</th>
                        <th>Answer</th>
                        <th>Course</th>
                        <th>Add </th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            int[] s=new int[5];
                        for(int i=0;i<5;i++)
                        {
                           %>
                      <tr>
                          <td>no</td>
                        <td>Trident</td>
                        <td>Internet
                          Explorer 4.0</td>
                        <td>Win 95+</td>
                        
                        <td><div class="form-group">
                            <label>
                                
                                <input type="checkbox" class="flat-red" id="qid" name="qid" value="<%=i%>" />
                            
                            </label>
                                
                            &nbsp;&nbsp;&nbsp;Add
                            </div>
                        </td>
                      </tr>
                      <%
                        }
                      %>
                    </tbody>
                    <tfoot>
                      <tr>
                          <th>Sr. No.</th>
                        <th>Question Description</th>
                        <th>Answer</th>
                        <th>Course</th>
                        <th>Add </th>
                        </tr>
                    </tfoot>
                  </table>
                </div><!-- /.box-body -->
              </div><!-- /.box -->
              
              
 <div class="box-footer" >
     <a href="#tab_3" data-toggle="tab"> <button  type="button" class="btn btn-primary pull-right">Next</button></a>
                    
                  </div>

