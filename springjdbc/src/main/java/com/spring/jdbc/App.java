package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

class App {
	public static void main(String[] args) {
//    	//spring jdbc=>JdbcTemplate
//       AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//       StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		// insert
//       Student student = new Student();
//       student.setId(456);
//       student.setName("Bikash");
//       student.setCity("Bhanjanagar");
//       
//       int result = studentDao.insert(student);
//       
//       System.out.println("row affected : "+result);
		// update
//       Student student = new Student();
//       student.setId(456);
//       student.setName("Rakesh");
//       student.setCity("Bhejiput");
//       
//       int result = studentDao.change(student);
//       
//       System.out.println("row affected : "+result);

		// delete
//       int result = studentDao.delete(456);
//       
//       System.out.println("row affected : "+result);

//       //select one student
//       Student student = studentDao.getStudent(222);
//       System.out.println(student);

		// select many student
//       List<Student> students = studentDao.getAllStudent();
//       for(Student s : students) {
//    	   System.out.println(s);
//       }

		// using javaConfigurartion
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();
		student.setId(567);
		student.setName("dipu");
		student.setCity("chikiti");

		int result = studentDao.insert(student);

		System.out.println("row affected : " + result);
		context.close();
	}
}
