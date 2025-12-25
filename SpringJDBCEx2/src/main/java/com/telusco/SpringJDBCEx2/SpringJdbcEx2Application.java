package com.telusco.SpringJDBCEx2;

import com.telusco.SpringJDBCEx2.model.Student;
import com.telusco.SpringJDBCEx2.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcEx2Application {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(SpringJdbcEx2Application.class, args);

		Student s = context.getBean(Student.class);
		s.setRollno(101);
		s.setName("Kiran");
		s.setMarks(78);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);

		List<Student> students = service.getStudents();
		System.out.println(students);

	}

}
