package com.febspringjdbc.febspringjdbcdemo.repos;

import com.febspringjdbc.febspringjdbcdemo.model.Student;

import java.util.List;

/**
 * Created by abhi on 02/02/19.
 */
public interface StudentRepo {

    List<Student> getStudentData();
    Student getStudentById(Integer id);
}
