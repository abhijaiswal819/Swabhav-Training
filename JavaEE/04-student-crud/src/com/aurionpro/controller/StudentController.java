package com.aurionpro.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.aurionpro.model.Student;
import com.aurionpro.model.StudentDbUtil;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDbUtil studentDbUtil;
       
    public StudentController() {
        super();
    }
    
    @Resource(name="jdbc/studentdb")
    private DataSource datasource;
    
    @Override
    public void init() throws ServletException{
    	super.init();
    	studentDbUtil = new StudentDbUtil(datasource);
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			listStudents(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<Student> students = studentDbUtil.getAllStudents();
		request.setAttribute("students", students);
		RequestDispatcher dispatcher = request.getRequestDispatcher("list-student.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
