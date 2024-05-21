package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext pj=SpringApplication.run(SpringprojectApplication.class, args);
//		Student s1 = pj.getBean(Student.class);
//		Student s2 = pj.getBean(Student.class);
		Dept d = pj.getBean(Dept.class);
		d.setDeptno(10);
		d.setdName("Devloveper");
		d.setLoc("U.S.A");
		Emp e=new Emp(d);
		e.setId(1001);
		e.setName("Krupa Venkat Kumar");
		e.show();
		
	}

}
