package com.prowings.service;

import java.util.List;

import com.prowings.dao.StudentDao;
import com.prowings.dao.StudentDaoImpl;
import com.prowings.entities.StudentEntity;
import com.prowings.model.Student;
import com.prowings.util.ModelToEntity;

public class StudentServiceImpl implements StudentService{

	StudentDao stdDao = new StudentDaoImpl();
	
	@Override
	public boolean createStudent(Student std) {
		
		return stdDao.createStudent(ModelToEntity.convertToStudentEntity(std));
	}

	@Override
	public Student getStudentByRoll(int roll) {
		StudentEntity entity = stdDao.getStudentByRoll(roll);
		
		if(null != entity)
			return ModelToEntity.convertToStudentModel(entity);
		else
			return null;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateStudent(int roll, Student std) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(int roll) {
		// TODO Auto-generated method stub
		return false;
	}

}
