package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	System.out.println("object created");
    	
    	Person person1=context.getBean("person1",Person.class);
    	person1.personInfo();
    	
    	Person person2=context.getBean("person2",Person.class);
    	person2.personInfo();
    }
}
