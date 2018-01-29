package com.eduask.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eduask.model.Page;
import com.eduask.model.Student;
import com.eduask.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@RequestMapping("/paging")
	public String select(Page page,HttpSession session){
	
		if(page.getShowPage()==0){
			page.setShowPage(1);
		}
		System.out.println(page);
		List<Student> stuList=ss.selectAll(page);
		session.setAttribute("stuList", stuList);
		return "person";
	}
}
