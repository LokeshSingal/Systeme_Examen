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
public interface CourseDaoInterface {
    public boolean insert(Course c) throws SQLException;
    
}
