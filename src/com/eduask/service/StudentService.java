package com.eduask.service;

import java.util.List;

import com.eduask.model.Page;
import com.eduask.model.Student;

public interface StudentService {

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    List<Student> selectAll(Page page); 
    
    List<Student> test(int id);
}
