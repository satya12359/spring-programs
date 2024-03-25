package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Person person1()
	{
		Person person=new Person();
		person.setName("sathya");
		person.setEmail("sathya@gmail.com");
		return person;
		
	}
	
	@Bean
	public Person person2()
	{
		Person person=new Person();
		person.setName("satya");
		person.setEmail("satya@gamil.com");
		return person;
		
	}
	


}
