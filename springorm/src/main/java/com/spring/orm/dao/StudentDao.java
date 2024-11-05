package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	    private HibernateTemplate hibernateTemplate;
	    
	    @Transactional
        public int insert(Student student) {
			return (Integer)this.hibernateTemplate.save(student);
        }
	    
	    //get a single data
	    public Student getStudent(int id) {
	    	return this.hibernateTemplate.get(Student.class,id);
	    }
	    //get all students
	    public List<Student> getStudents() {
	    	return this.hibernateTemplate.loadAll(Student.class);
	    }
	    
	    //delete
	    @Transactional
	    public boolean deleteStudent(int id) {
	    	boolean f=false;
	    	Student student = this.hibernateTemplate.get(Student.class,id);
	    	this.hibernateTemplate.delete(student);
	    	f=true;
			return f;  	
	    }
	    
	    //update
	    @Transactional
	    public void updateStudent(Student student) {
	    	this.hibernateTemplate.update(student);
	    }
		public HibernateTemplate getHibernateTemplate() {
			return hibernateTemplate;
		}
		public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		}
		public StudentDao(HibernateTemplate hibernateTemplate) {
			super();
			this.hibernateTemplate = hibernateTemplate;
		}
		public StudentDao() {
			super();
			// TODO Auto-generated constructor stub
		}
}
