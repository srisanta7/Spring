package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ){
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Student st = (Student)context.getBean("student1");
        System.out.println(st);
    }
}
