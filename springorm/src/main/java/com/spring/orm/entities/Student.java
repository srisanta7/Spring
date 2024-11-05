package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_details")
public class Student {
   @Override
	public String toString() {
		return "Student [id=" + id + ", StudentName=" + StudentName + ", studentCity=" + studentCity + "]";
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
public Student(int id, String studentName, String studentCity) {
		super();
		this.id = id;
		StudentName = studentName;
		this.studentCity = studentCity;
	}
   @Id
   @Column(name="student_id")
   private int id;
   @Column(name="student_name")
   private String StudentName;
   @Column(name="student_city")
   private String studentCity;
}
