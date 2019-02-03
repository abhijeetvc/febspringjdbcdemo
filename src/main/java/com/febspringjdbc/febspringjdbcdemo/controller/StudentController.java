package com.febspringjdbc.febspringjdbcdemo.controller;

import com.febspringjdbc.febspringjdbcdemo.impl.StudentImpl;
import com.febspringjdbc.febspringjdbcdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by abhi on 02/02/19.
 */

@RestController
public class StudentController {

    @Autowired
    private StudentImpl studentImpl;

    @GetMapping(value="/getData")
    public List<Student> getAllRecords(){
         List<Student> list=studentImpl.getStudentData();
         return list;
    }
}
