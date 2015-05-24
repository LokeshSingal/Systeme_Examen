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
public class Question_Bank {
    private int Ques_id;
    private int Instructor_id;
    private String Q_desc;
    private String Question;
    private String OptionA;
    private String OptionB;
    private String OptionC;
    private String OptionD;
    private String Solution;
    private String Level;
    private String Course_id;
    private String Marks;

    public void setMarks(String Marks) {
        this.Marks = Marks;
    }

    public String getMarks() {
        return Marks;
    }
    public int getQues_id() {
        return Ques_id;
    }

    public int getInstructor_id() {
        return Instructor_id;
    }

    public String getQ_desc() {
        return Q_desc;
    }

    public String getQuestion() {
        return Question;
    }

    public String getOptionA() {
        return OptionA;
    }

    public String getOptionB() {
        return OptionB;
    }

    public String getOptionC() {
        return OptionC;
    }

    public String getOptionD() {
        return OptionD;
    }

    public String getSolution() {
        return Solution;
    }

    public String getLevel() {
        return Level;
    }

    public String getCourse_id() {
        return Course_id;
    }

    public void setQues_id(int Ques_id) {
        this.Ques_id = Ques_id;
    }

    public void setInstructor_id(int Instructor_id) {
        this.Instructor_id = Instructor_id;
    }

    public void setQ_desc(String Q_desc) {
        this.Q_desc = Q_desc;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public void setOptionA(String OptionA) {
        this.OptionA = OptionA;
    }

    public void setOptionB(String OptionB) {
        this.OptionB = OptionB;
    }

    public void setOptionC(String OptionC) {
        this.OptionC = OptionC;
    }

    public void setOptionD(String OptionD) {
        this.OptionD = OptionD;
    }

    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public void setCourse_id(String Course_id) {
        this.Course_id = Course_id;
    }
    
    
}
