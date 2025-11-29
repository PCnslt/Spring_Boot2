package com.tulesko.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemo2Application.class, args);

		Alien obj=context.getBean(Alien.class);
		System.out.println(obj.getAge());
		obj.code();

	}



}
