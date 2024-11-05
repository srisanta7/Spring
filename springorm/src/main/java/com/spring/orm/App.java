package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao sd = context.getBean("studentDao", StudentDao.class);
//        Student student = new Student(345,"Biswa","Gobara");
//        int result = sd.insert(student);
//        System.out.println(result);

		// orm project
		System.out.println("=8=8=8=8=8=< Welcome to spring orm project >=8=8=8=8=8=");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
		while (go) {
			// display menu
			System.out.println("press 1 for add a new student");
			System.out.println("press 2 for display all students");
			System.out.println("press 3 for get details of a single student");
			System.out.println("press 4 for delete students");
			System.out.println("press 5 for update student");
			System.out.println("press 6 for exit");
			try {
				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:
                    //add
					System.out.println("Enter user id");
					int id = Integer.parseInt(br.readLine());
					System.out.println("Enter student name");
					String name = br.readLine();
					System.out.println("Enter student city");
					String city = br.readLine();
					Student s = new Student();
					s.setId(id);
					s.setStudentName(name);
					s.setStudentCity(city);
					int r = sd.insert(s);
					System.out.println(r+" : student added");
					System.out.println("8888888888888888888888");
					break;
				case 2:
                    //show
					List<Student> allStudents = sd.getStudents();
					for(Student st :allStudents) {
						System.out.println(st);
						System.out.println("==================");
					}
					break;
				case 3:
                    //get a single student
					System.out.println("Enter user id");
					int sid = Integer.parseInt(br.readLine());
					Student st = sd.getStudent(sid);
					System.out.println(st);
					break;
				case 4:
                    //delete
					System.out.println("Enter user id");
					int stid = Integer.parseInt(br.readLine());
					boolean b = sd.deleteStudent(stid);
					if(b) System.out.println("student deleted sucessfully");
					break;
				case 5:
                    //update
					System.out.println("Enter user id");
					int uid = Integer.parseInt(br.readLine());
					System.out.println("Enter student name");
					String sname = br.readLine();
					System.out.println("Enter student city");
					String scity = br.readLine();
					Student s1 = new Student();
					s1.setId(uid);
					s1.setStudentName(sname);
					s1.setStudentCity(scity);
					sd.updateStudent(s1);
					System.out.println("student updated");
					System.out.println(sd.getStudent(uid));
					System.out.println("8888888888888888888888");
					break;
				case 6:
                    //exit
					go=false;
					break;

				default:
					break;
				}

			} catch (Exception e) {
				System.out.println("Invalid Input Try with another one!!");
				System.out.println(e.getMessage());
			}
		}
        System.out.println("Thank you for using my application \n \t See you soon");
	}
}
