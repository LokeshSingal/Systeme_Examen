/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.model;

import java.sql.Date;

/**
 *
 * @author lokesh
 */
public class Result {
    
    private int R_id;
    private int R_user_id;
    private int R_exam_id;
    private Date R_Date;
    private int Score;

    public int getR_id() {
        return R_id;
    }

    public int getR_user_id() {
        return R_user_id;
    }

    public int getR_exam_id() {
        return R_exam_id;
    }

    public Date getR_Date() {
        return R_Date;
    }

    public int getScore() {
        return Score;
    }

    public void setR_id(int R_id) {
        this.R_id = R_id;
    }

    public void setR_user_id(int R_user_id) {
        this.R_user_id = R_user_id;
    }

    public void setR_exam_id(int R_exam_id) {
        this.R_exam_id = R_exam_id;
    }

    public void setR_Date(Date R_Date) {
        this.R_Date = R_Date;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    
}
