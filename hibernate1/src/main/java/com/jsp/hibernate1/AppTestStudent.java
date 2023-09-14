package com.jsp.hibernate1;

import java.util.ArrayList;
import java.util.List;

import Entity.Course;
import Entity.Student;
import Repository.StudentRepository;

public class AppTestStudent {
	public static void main(String[] args) {
	
		Course c1 = new Course();
		c1.setName("java");
		c1.setCredits("good");

		Course c2 = new Course();
		c2.setName("sql");
		c2.setCredits("medium");
		
		Course c3 = new Course();
		c3.setName("python");
		c3.setCredits("bad");
		
		List<Course> cur = new ArrayList<>();
		cur.add(c1);
		cur.add(c2);
		cur.add(c3);
		
	    Student s1 = new Student();
	    s1.setName("mr.anjan kumar");
	    s1.setEmail("anjan@123");
	    s1.setCourses(cur);
	    
	    Student s2 = new Student();
	    s2.setName("ashok");
	    s2.setEmail("ashok@123");
	    s2.setCourses(cur);
	    
	    Student s3 = new Student();
	    s3.setName("mr.raveesh");
	    s3.setEmail("raveesh@123");
	    s3.setCourses(cur);
	    
	    List<Student> stu = new ArrayList<>();
	    stu.add(s1);
	    stu.add(s2);
	    stu.add(s3);
	    
	    c1.setStudent(stu);
	    c2.setStudent(stu);
	    c3.setStudent(stu);
	    
	    StudentRepository repository = new StudentRepository();
	    repository.saveStudent(stu);
	}
}
