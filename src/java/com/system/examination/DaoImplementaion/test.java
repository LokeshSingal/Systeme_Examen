/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.examination.DaoImplementaion;

import com.system.examination.model.Course;
import com.system.examination.model.Exam_list;
import com.system.examination.model.Login;
import com.system.examination.model.User_info;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Kishan
 */
public class test {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, ParseException {

        
        /*****************************      User_info TESTING OK ***************************/
    
        User_InfoDaoImple uid = new User_InfoDaoImple();
        User_info ui = new User_info();
        
        ui.setGender("M");
        ui.setInstitute_name("DAIICT");
        ui.setImage("v ipdatedjhsbvhb");
        ui.setName("PMJ");
        ui.setProgram("Null");
        ui.setUser_id(123);
/*
        if (uid.insert(ui)) {
            System.out.println("inserted in user_info");
        }
/*
        if (uid.update(ui)) {
            System.out.println("updated_user_info");
        }

        if (uid.delete(123)) {
            System.out.println("deleted_user_info");
        }

        Object x = uid.getAll();
        ArrayList<User_info> list = (ArrayList<User_info>) x;

        for (User_info Userinfo : list) {
            System.out.println(Userinfo.getName() + ","
                    + Userinfo.getGender() + ","
                    + Userinfo.getProgram() + ","
                    + Userinfo.getInstitute_name() + ","
                    + Userinfo.getUser_id() + ","
                    + Userinfo.getImage());
        }
        
        
        /*****************************      Login_Credentials TESTING OK ***************************/
        LoginDaoImple ld = new LoginDaoImple();
        Login l = new Login();
        
        l.setUser_id(123);
        l.setUser_email("123@456.com updated");
        l.setUser_username("lokesh");
        l.setUser_password("lokesh");
        l.setPri_Admin(1);
        l.setPri_Instructor(1);
        l.setPri_Student(0);
        
 /*     
         if (ld.insert(l)) {
            System.out.println("inserted in login_credentials");
        }

  /*      
        if (ld.update(l)) {
            System.out.println("updated login_credentials");
        }
/*
        if (ld.delete(123)) {
            System.out.println("deleted login_credentials");
        }
*/
        Object x = ld.getAll();
        ArrayList<Login> list = (ArrayList<Login>) x;

        for (Login login : list) {
            System.out.println(login.getUser_id()+ ","
                    + login.getUser_email()+ ","
                    + login.getUser_username()+ ","
                    + login.getUser_password()+ ","
                    + login.getPri_Admin()+ ","
                    + login.getPri_Student()+ ","
                    + login.getPri_Instructor());
        }
        
        
        /*****************************      Exam_Question TESTING OK ***************************/
        
        
        /*****************************      Result TESTING OK ***************************/
        
        
        /*****************************      Question_Bank TESTING OK ***************************/
        
        

        /*****************************      Exam_list TESTING OK ***************************/
        
      
        Exam_ListDaoImple eld = new Exam_ListDaoImple();
        Exam_list el = new Exam_list();

       
        Date dt = new Date(2015,8,15);
        
        Time t = new Time(2, 56, 52);

        el.setExam_id(45);
        el.setExam_desc("Exam updated Testing");
        el.setInstructor_id(123);
        el.setDeclare_date(dt);
        el.setDuration(t);
        el.setNo_of_ques(50);
        el.setTotal_marks(200);
        el.setShow_instant_result(0);
        el.setExam_username("Test1");
        el.setExam_password("password");
/*
        if (eld.insert(el)) {
            System.out.println("inserted exam_list");
        }
*/
 /*       
        if (eld.update(el)) {
            System.out.println("updated");
        }

/*
        if (eld.delete(45)) {
            System.out.println("deleted");
        }
/*
        Object x = eld.getAll();
        ArrayList<Exam_list> list = (ArrayList<Exam_list>) x;

        for (Exam_list examlist : list) {
            System.out.println(examlist.getExam_id() + "," + examlist.getExam_desc() + "," + examlist.getInstructor_id() + "," + examlist.getNo_of_ques());
        }
        
        
        
        
        
        
        /*****************************      COURSE TESTING OK ***************************/
        
         CourseDaoImple cd=new CourseDaoImple();
        
         Course c=new Course();
        
         c.setCourseID("IT615");
         c.setCourseName("Enterprise Computing");
         c.setCourseDesc("Insert Update Demo");
 /*       
         //Testing To get All the list of courses
         Object x = cd.getAll();
         ArrayList<Course> list = (ArrayList<Course>) x;
        
         for(Course course : list)
         {
         System.out.println( course.getCourseID() + "," + course.getCourseName() + "," + course.getCourseDesc());
         }
        
         
/*         
         if(cd.insert(c))
         {
         System.out.println("inserted");
         }
        
        
         if(cd.update(c))
         {
         System.out.println("updated");
         }
        
        
         
         if(cd.delete(c.getCourseID()))
         {
         System.out.println("Deleted");
         }
               
*/
    }
}
