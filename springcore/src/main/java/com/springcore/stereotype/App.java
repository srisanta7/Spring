package com.springcore.stereotype;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("stereoConfig.xml");
        Employee e1 = context.getBean("emp",Employee.class);
        System.out.println(e1);
    }
}
