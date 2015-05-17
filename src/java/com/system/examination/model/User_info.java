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
public class User_info {
    
    private int user_id;
    private String name;
    private String Image;
    private String Institute_name;

    public int getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return Image;
    }

    public String getInstitute_name() {
        return Institute_name;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public void setInstitute_name(String Institute_name) {
        this.Institute_name = Institute_name;
    }
    
    
}
