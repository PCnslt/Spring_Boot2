package com.telusco.SpringJDBCEx;

import com.telusco.SpringJDBCEx.model.Student;
import com.telusco.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setRollNo(101);
		s.setName("Navin");
		s.setMarks(78);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);

	}




}
