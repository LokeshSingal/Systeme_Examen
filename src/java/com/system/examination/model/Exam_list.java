/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author lokesh
 */
public class Exam_list {
    
    
    private int exam_id;
    private int instructor_id;
    private String exam_desc;
    private int no_of_ques;
    private Time duration;
    private boolean Show_instant_result;
    private Date declare_date;
    private int total_marks;
    private String exam_username;
    private String exam_password;

    public int getExam_id() {
        return exam_id;
    }

    public int getInstructor_id() {
        return instructor_id;
    }

    public String getExam_desc() {
        return exam_desc;
    }

    public int getNo_of_ques() {
        return no_of_ques;
    }

    public Time getDuration() {
        return duration;
    }

    public boolean isShow_instant_result() {
        return Show_instant_result;
    }

    public Date getDeclare_date() {
        return declare_date;
    }

    public int getTotal_marks() {
        return total_marks;
    }

    public String getUsername() {
        return exam_username;
    }

    public String getPassword() {
        return exam_password;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public void setExam_desc(String exam_desc) {
        this.exam_desc = exam_desc;
    }

    public void setNo_of_ques(int no_of_ques) {
        this.no_of_ques = no_of_ques;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }

    public void setShow_instant_result(boolean Show_instant_result) {
        this.Show_instant_result = Show_instant_result;
    }

    public void setDeclare_date(Date declare_date) {
        this.declare_date = declare_date;
    }

    public void setTotal_marks(int total_marks) {
        this.total_marks = total_marks;
    }

    public void setUsername(String exam_username) {
        this.exam_username = exam_username;
    }

    public void setPassword(String exam_password) {
        this.exam_password = exam_password;
    }
    
    
}
