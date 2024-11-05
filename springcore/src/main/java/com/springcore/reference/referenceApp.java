package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class referenceApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("referenceConfig.xml");
		Student st =(Student)context.getBean("student");
        System.out.println(st);
	}
}
