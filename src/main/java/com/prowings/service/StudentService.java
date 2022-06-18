package com.prowings.service;

import java.util.List;

import com.prowings.model.Student;

public interface StudentService {
	
	public boolean createStudent(Student std);
	
	public Student getStudentByRoll(int roll);
	
	public List<Student> getAllStudents();
	
	public boolean updateStudent(int roll, Student std);
	
	public boolean deleteStudent(int roll);

}
