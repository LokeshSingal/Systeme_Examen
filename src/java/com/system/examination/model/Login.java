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
public class Login {
    private int user_id;
    private String user_username;
    private String user_password;
    private String user_email;
    private int Pri_Instructor;
    private int Pri_Student;
    private int Pri_Admin;

    public int getUser_id() {
        return user_id;
    }

    public String getUser_username() {
        return user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_email() {
        return user_email;
    }

    public int getPri_Instructor() {
        return Pri_Instructor;
    }

    public int getPri_Student() {
        return Pri_Student;
    }

    public int getPri_Admin() {
        return Pri_Admin;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setPri_Instructor(int Pri_Instructor) {
        this.Pri_Instructor = Pri_Instructor;
    }

    public void setPri_Student(int Pri_Student) {
        this.Pri_Student = Pri_Student;
    }

    public void setPri_Admin(int Pri_Admin) {
        this.Pri_Admin = Pri_Admin;
    }

    
    
    
}
