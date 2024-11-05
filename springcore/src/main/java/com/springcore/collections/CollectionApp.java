package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
		Employee emp1 = (Employee)context.getBean("Employee");
        System.out.println(emp1);
	}

}
