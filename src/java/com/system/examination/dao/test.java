/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.dao;

import com.system.examination.model.Course;
import java.sql.SQLException;

/**
 *
 * @author Kishan
 */
public class test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        CourseDaoImple cd=new CourseDaoImple();
        Course c=new Course();
        c.setCourseID("IT615");
        c.setCourseName("Enterprise Computing");
        c.setCourseDesc("Insert Demo");
        
        if(cd.delete(c.getCourseID()))
        {
            System.out.println("Deleted");
        }
    }
}
