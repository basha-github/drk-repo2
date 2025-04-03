package com.example.demo.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	int id;
	String name;
	String college;
	int fee;
	String mobile;
	String course;
	
	public Student() {
	
	}

	public Student(int id, String name, String college, int fee, String mobile, String course) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.fee = fee;
		this.mobile = mobile;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	
	
	

}
