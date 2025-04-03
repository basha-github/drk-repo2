package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.Student;
import com.example.demo.repo.StudentRepo;




@RestController
public class DBController {
	
	@Autowired
	StudentRepo stuRepo;
	
	
	@RequestMapping("/abc/get/all")
	public List<Student> getAllStudents() {
		
		return stuRepo.findAll();
		
	}
	
	
	
	@RequestMapping("/drk/stu/add")
	public String addNewStudent(@RequestParam int id,String name,
			String course,int fee,
			String mobile,String college) {
		
		Student stu1 = new Student(id, name, college, fee, 
				mobile, course);
		
		stuRepo.save(stu1);
		
		return "Successfully Inserted Data into the DB";
	}

}
