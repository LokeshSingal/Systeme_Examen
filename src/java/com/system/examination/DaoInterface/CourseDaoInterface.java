<<<<<<< HEAD
package com.system.examination.DaoInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.system.examination.model.Course;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Kishan
 */
public interface CourseDaoInterface {
    public boolean insert(Course c) throws SQLException;
    public boolean delete(String c_id) throws SQLException;
    public boolean update(Course c) throws SQLException;
    public ArrayList<Course> getAll() throws SQLException;
    
    
}
=======
package com.system.examination.DaoInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import com.system.examination.model.Course;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Kishan
 */
public interface CourseDaoInterface {
    public boolean insert(Course c) throws SQLException;
    public boolean delete(String c_id) throws SQLException;
    public boolean update(Course c) throws SQLException;
    public ArrayList<Course> getAll() throws SQLException;
    
    
}
>>>>>>> da6d8d8c909c53b96c24fb1fe2e98e325abe61e0
