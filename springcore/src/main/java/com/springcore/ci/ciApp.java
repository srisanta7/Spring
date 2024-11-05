package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ciApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ciConfig.xml");
		Student st = (Student)context.getBean("student1");
		System.out.println(st);
	}

}
