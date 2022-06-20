package com.prowings.util;

import com.prowings.entities.StudentEntity;
import com.prowings.model.Student;

public class ModelToEntity {
	
	public static StudentEntity convertToStudentEntity(Student model)
	{
		StudentEntity entity = new StudentEntity();
		
		entity.setRoll(model.getRoll());
		entity.setName(model.getName());
		entity.setAddress(model.getAddress());
		
		return entity;
		
	}
	
	public static Student convertToStudentModel(StudentEntity entity)
	{
		Student model = new Student();
		
		model.setRoll(entity.getRoll());
		model.setName(entity.getName());
		model.setAddress(entity.getAddress());
		
		return model;
		
	}

}
