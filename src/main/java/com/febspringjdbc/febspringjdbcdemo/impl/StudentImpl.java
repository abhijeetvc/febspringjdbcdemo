package com.febspringjdbc.febspringjdbcdemo.impl;

import com.febspringjdbc.febspringjdbcdemo.model.Student;
import com.febspringjdbc.febspringjdbcdemo.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

/**
 * Created by abhi on 02/02/19.
 */
@Repository
public class StudentImpl implements StudentRepo{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Student> getStudentData() {

        String sql="select * from student";
        List<Student> list=jdbcTemplate.
                query(sql,new BeanPropertyRowMapper(Student.class));
        return list;
    }

    @Override
    public Student getStudentById(Integer id) {

        String sql="select * from student where id=?";
        Student list=jdbcTemplate.queryForObject(sql,new Object[]{id},
                Student.class);
        return list;
    }
}
