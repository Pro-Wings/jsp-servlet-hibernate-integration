package com.prowings.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.entities.StudentEntity;

public class StudentDaoImpl implements StudentDao{

	SessionFactory factory = HibernateUtil.getSessionFactory();
	
	@Override
	public boolean createStudent(StudentEntity std) {
		Session session = null;
		try
		{
			session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(std);
			tx.commit();
			session.close();
			System.out.println("Student record saved to DB successfully!!!");
			return true;
		}
		catch (Exception e) {
			System.out.println("Unable to store Student record to DB!!! ");
			e.printStackTrace();
			return false;
		}
		finally {
			session.close();
		}
		
	}

	@Override
	public StudentEntity getStudentByRoll(int roll) {
		StudentEntity entity = new StudentEntity();
		String hql ="from StudentEntity student where student.roll = :rollNumber";
		Session session = null;

		try
		{
			session = factory.openSession();
			Transaction tx = session.beginTransaction();
			Query<StudentEntity>  query = session.createQuery(hql);
			query.setParameter("rollNumber", roll);
			entity = query.uniqueResult();
			
			tx.commit();
			
			System.out.println("Student record fetched from DB successfully!!!");
			return entity;
		}
		catch (Exception e) {
			System.out.println("Unable to fetch Student record from DB!!! ");
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();		}
	}

	@Override
	public List<StudentEntity> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateStudent(int roll, StudentEntity std) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(int roll) {
		// TODO Auto-generated method stub
		return false;
	}

}
