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
public class Exam_Questions {

    private int exam_id;
    private int ques_id;
    private int q_marks;

    public int getExam_id() {
        return exam_id;
    }

    public int getQues_id() {
        return ques_id;
    }

    public int getQ_marks() {
        return q_marks;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public void setQues_id(int ques_id) {
        this.ques_id = ques_id;
    }

    public void setQ_marks(int q_marks) {
        this.q_marks = q_marks;
    }
    
    
    
}
