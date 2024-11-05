package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		
		//insert query
	       String q = "insert into student(id,name,city) values(?,?,?)";
	       
	       int r = this.jdbcTemplate.update(q,student.getId(),student.getName(),student.getCity());
		
		return r;
	}
	
	@Override
	public int change(Student student) {
		
		//update query
		String q = "update student set name=? , city=? where id=?";
		//query fire
		int result = this.jdbcTemplate.update(q,student.getName(),student.getCity(),student.getId());
		//return result
		return result;
	}

	@Override
	public int delete(int id) {
		//query
		String q = "delete from student where id=?";
		//fire
		int result = this.jdbcTemplate.update(q,id);
		return result;
	}
	
	@Override
	public Student getStudent(int studentId) {
		//collecting single student data
		
		String q = "select * from student where id=?";
		
		//creating RoWMapper object
		RowMapper<Student> rowMapper = new RowMapperImpl();
		//query fire
		Student student = this.jdbcTemplate.queryForObject(q, rowMapper,studentId);
		
		return student;
	}
	
	@Override
	public List<Student> getAllStudent() {
		//collecting multiple objects from db
		
		String q = "select * from student;";
		
		List<Student> students = this.jdbcTemplate.query(q,  new RowMapperImpl());
		
		return students;
	}
	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

	
}









