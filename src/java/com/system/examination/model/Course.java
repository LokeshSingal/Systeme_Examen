/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.model;

/**
 *
 * @author lokesh
 */
public class Course {
    private String C_id;
    private String C_name;
    private String C_desc;
    
    public void setCourseID(String courseID)
    {
        C_id=courseID;
    }
    public void setCourseName(String courseName)
    {
        C_name=courseName;
    }
    public  void setCourseDesc(String CourseDesc)
    {
        C_desc=CourseDesc;
    }
    public String getCourseID()
    {
        return C_id;
    }
    public String getCourseName()
    {
        return C_name;
    }
    public String getCourseDesc()
    {
        return C_desc;
    }
}
