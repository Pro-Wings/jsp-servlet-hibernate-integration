package com.prowings.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prowings.model.Student;
import com.prowings.service.StudentService;
import com.prowings.service.StudentServiceImpl;

public class GetStudentController extends HttpServlet{
	
	StudentService service = new StudentServiceImpl();
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		
		int roll = Integer.parseInt(req.getParameter("roll"));
		
		Student model = service.getStudentByRoll(roll);
		
		PrintWriter out = res.getWriter();
		if (model != null) {
			out.println("Student record : "+model);
		}
		else
			out.println("Unable to fetch student record!!!");
			
	}

}
