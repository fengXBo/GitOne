package com.eduask.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.eduask.model.Page;
import com.eduask.model.Student;

@Repository
public interface StudentDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    List<Student> selectAll(Page page); 
    
    List<Student> test(int id);
}