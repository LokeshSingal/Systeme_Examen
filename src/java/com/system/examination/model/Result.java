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
public class Result {
    
    private int R_exam_id;
    private int R_user_id;
    private String R_ques_id;
    private String Submission;
    private int Evaluation;

    public int getR_exam_id() {
        return R_exam_id;
    }

    public int getR_user_id() {
        return R_user_id;
    }

    public String getR_ques_id() {
        return R_ques_id;
    }

    public String getSubmission() {
        return Submission;
    }

    public int getEvaluation() {
        return Evaluation;
    }

    public void setR_exam_id(int R_exam_id) {
        this.R_exam_id = R_exam_id;
    }

    public void setR_user_id(int R_user_id) {
        this.R_user_id = R_user_id;
    }

    public void setR_ques_id(String R_ques_id) {
        this.R_ques_id = R_ques_id;
    }

    public void setSubmission(String Submission) {
        this.Submission = Submission;
    }

    public void setEvaluation(int Evaluation) {
        this.Evaluation = Evaluation;
    }

    
}
