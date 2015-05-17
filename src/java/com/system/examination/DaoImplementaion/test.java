/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.system.examination.DaoImplementaion;

import com.system.examination.model.Course;
import java.sql.SQLException;
import java.util.ArrayList;

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
        c.setCourseDesc("Insert Update Demo");
        
        //Testing To get All the list of courses
        Object x = cd.getAll();
        ArrayList<Course> list = (ArrayList<Course>) x;
        
        for(Course course : list)
        {
            System.out.println( course.getCourseID() + "," + course.getCourseName() + "," + course.getCourseDesc());
        }
        
        //
        /*
        if(cd.insert(c))
        {
            System.out.println("inserted");
        }
        */
        if(cd.update(c))
        {
            System.out.println("updated");
        }
        
        
       /*
        if(cd.delete(c.getCourseID()))
        {
            System.out.println("Deleted");
        }*/
    }
}
