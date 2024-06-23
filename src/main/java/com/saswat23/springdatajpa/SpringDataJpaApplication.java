package com.saswat23.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.saswat23.springdatajpa.model.Student;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		
		StudentRepo repo = context.getBean(StudentRepo.class);
		
		Student s1 = context.getBean(Student.class);
		
		Student s2 = context.getBean(Student.class);
		
		Student s3 = context.getBean(Student.class);
		
//		System.out.println("s1: "+s1.hashCode());
//		System.out.println("s2: "+s2.hashCode());
//		System.out.println("s3: "+s3.hashCode());
		
		if(repo.findAll().size()==0) {
			s1.setRollNo(1);
			s1.setMarks(67.88);
			s1.setUserId("stud001");
			s1.setUsername("Saswat");
			
			s2.setRollNo(2);
			s2.setMarks(75.12);
			s2.setUserId("stud002");
			s2.setUsername("Sarita");
			
			s3.setRollNo(3);
			s3.setMarks(55.9);
			s3.setUserId("stud003");
			s3.setUsername("Chandan");
			
			repo.save(s1);
			repo.save(s2);
			repo.save(s3);
		}
		
		System.out.println("StudentList: "+repo.findAll());
	}

}
