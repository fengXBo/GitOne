package com.eduask.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduask.dao.StudentDao;
import com.eduask.model.Page;
import com.eduask.model.Student;
import com.eduask.service.StudentService;

@Service
public class StuSerImp implements StudentService{

	@Autowired
	private StudentDao sd;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return sd.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Student record) {
		// TODO Auto-generated method stub
		return sd.insert(record);
	}

	@Override
	public int insertSelective(Student record) {
		// TODO Auto-generated method stub
		return sd.insertSelective(record);
	}

	@Override
	public Student selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return sd.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Student record) {
		// TODO Auto-generated method stub
		return sd.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(Student record) {
		// TODO Auto-generated method stub
		return sd.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Student> selectAll(Page page) {
		// TODO Auto-generated method stub
		return sd.selectAll(page);
	}

	@Override
	public List<Student> test(int id) {
		return sd.test(id);
	}

}
