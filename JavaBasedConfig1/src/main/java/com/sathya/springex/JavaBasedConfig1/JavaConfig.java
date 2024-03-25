package com.sathya.springex.JavaBasedConfig1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public EmailServices emailServices() {
		EmailServices emailServices=new EmailServices();
		return emailServices;
		
	}
	
	@Bean
	public JavaCourseService javaCourseService() {
		JavaCourseService javaCourseService = new JavaCourseService();
		return javaCourseService;
		
	}
	
	@Bean
	public Student student() {
		Student student=new Student();
		student.setEmailservices(emailServices());
		student.setJavaCourseService(javaCourseService());
		return student;
	}
	

}
