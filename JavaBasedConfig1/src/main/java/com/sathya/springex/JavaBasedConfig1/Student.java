package com.sathya.springex.JavaBasedConfig1;

public class Student {
	private EmailServices emailservices ;
	private JavaCourseService javaCourseService;
	public EmailServices getEmailservices() {
		return emailservices;
	}
	public void setEmailservices(EmailServices emailservices) {
		this.emailservices = emailservices;
	}
	public JavaCourseService getJavaCourseService() {
		return javaCourseService;
	}
	public void setJavaCourseService(JavaCourseService javaCourseService) {
		this.javaCourseService = javaCourseService;
	}
	
	public void details() {
		emailservices.message();
		javaCourseService.courseInfo();
	}
		
}
