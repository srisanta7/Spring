package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ){
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        Student st = context.getBean("getStudent",Student.class);
        System.out.println(st);
        st.study();
        context.close();
    }
}
