package com.telusko.spring_data_jpa_ex;

import com.telusko.spring_data_jpa_ex.model.Student;
import com.telusko.spring_data_jpa_ex.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
//
//		s1.setRollno(101);
//		s1.setName("Navin");
//		s1.setMarks(90);
//
		s2.setRollno(102);
		s2.setName("Mark");
		s2.setMarks(50);
//
		s3.setRollno(103);
		s3.setName("Jane");
		s3.setMarks(65);
//
//		repo.save(s1);
		repo.save(s2);
//		repo.save(s3);

		System.out.println(repo.findByName("Mark"));
		System.out.println(repo.findByMarksGreaterThan(72));

		//Update record
		repo.save(s3);

		//Delete record
		repo.delete(s2);

	}

}
