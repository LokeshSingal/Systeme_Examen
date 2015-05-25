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
public class Submission {
    
    private int R_id;
    private int S_ques_id;
    private String Submission;
    private int Evaluation;

    public int getR_id() {
        return R_id;
    }


    public int getS_ques_id() {
        return S_ques_id;
    }

    public String getSubmission() {
        return Submission;
    }

    public int getEvaluation() {
        return Evaluation;
    }

    public void setR_id(int R_id) {
        this.R_id = R_id;
    }


    public void setS_ques_id(int S_ques_id) {
        this.S_ques_id = S_ques_id;
    }

    public void setSubmission(String Submission) {
        this.Submission = Submission;
    }

    public void setEvaluation(int Evaluation) {
        this.Evaluation = Evaluation;
    }
    
    
}
