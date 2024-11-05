package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args ){
    	AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycleConfig.xml");
        Samosa s = (Samosa)context.getBean("samosa");
        System.out.println(s);
        context.registerShutdownHook();
    	
      Pepsi p = (Pepsi)context.getBean("pepsi");
      System.out.println(p);
      
      Chai c = (Chai)context.getBean("chai");
      System.out.println(c);
      context.registerShutdownHook();
    }
}
