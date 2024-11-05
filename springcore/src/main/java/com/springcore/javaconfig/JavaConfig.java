package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		Samosa s = new Samosa();
		return s;
	}
	
	@Bean
	public Student getStudent() {
		
		Student st = new Student(getSamosa());
		return st;
	}
	

}
