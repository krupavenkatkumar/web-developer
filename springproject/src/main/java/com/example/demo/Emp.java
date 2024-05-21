package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Emp {
	private int id;
	private String name;
	@Autowired
	private Dept dept;
	public Emp(Dept dept){
		this.dept=dept;
		
	}
	public void show() {
		System.out.println("Id: "+getId()+" "+"Name: "+getName()+" "+"Dept: "+getDept().toString());
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
	public Dept getDept() {
		return dept;
	}
//	public void setDept(Dept dept) {
//		this.dept = dept;
//	}
	

}
