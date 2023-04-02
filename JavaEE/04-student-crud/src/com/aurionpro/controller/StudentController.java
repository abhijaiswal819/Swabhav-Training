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

	@Resource(name = "jdbc/studentdb")
	private DataSource datasource;

	@Override
	public void init() throws ServletException {
		super.init();
		studentDbUtil = new StudentDbUtil(datasource);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println(request.getParameter("command"));
		String command = request.getParameter("command");
//		System.out.println(command);
		if (command == null) {
			command = "LIST";
		}
		try {
			switch (command) {
			case "LIST":
				listStudents(request, response);
				break;
			case "ADD":
				addStudent(request, response);
//				loadStudent(request, response);
				break;
			case "LOAD":
				loadStudent(request, response);
				break;
			case "UPDATE":
				updateStudent(request, response);
				break;
			case "DELETE":
				deleteStudent(request, response);
				break;
			}
		
//			listStudents(request, response);
		}catch(

	Exception e)
	{
		e.printStackTrace();
	}
	}

	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("studentId"));
//		System.out.println(id);
		studentDbUtil.deleteStudent(id);
		studentDbUtil.dropIDStudent();
		studentDbUtil.addIDStudent();
		response.sendRedirect(request.getContextPath() + "/StudentController");		
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("student_id"));
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String email = request.getParameter("email");
		Student tempStudent = new Student(id, firstName, lastName, email);
//		System.out.println(tempStudent);
		studentDbUtil.updateStudent(tempStudent);
		response.sendRedirect(request.getContextPath() + "/StudentController");
	}

	private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int id = Integer.parseInt(request.getParameter("studentId"));
		Student student = studentDbUtil.getStudentById(id);
		request.setAttribute("theStudent", student);
		RequestDispatcher dispatcher = request.getRequestDispatcher("update-student.jsp");
		dispatcher.forward(request, response);	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("last_name");
		String email = request.getParameter("email");
		Student tempStudent = new Student(firstName, lastName, email);
//		studentDbUtil.addStudent(tempStudent);
//		response.sendRedirect(request.getContextPath()+"/StudentController");

		List<Student> students = studentDbUtil.getAllStudents();
		boolean isStudentPresent = false;
//		
//		for (Student x : students) {
//			if (x.getFirstName().equals(tempStudent.getFirstName()) && x.getLastName().equals(tempStudent.getLastName())
//					&& x.getEmail().equals(tempStudent.getEmail())) {
//				isStudentPresent = true;
//			}
//		}
		for (Student x : students) {
			if (x.getEmail().equals(tempStudent.getEmail())) {
				isStudentPresent = true;
			}
		}
//		for (int i = 0; i < students.size(); i++) {
//			if (students.get(i).getFirstName().equals(tempStudent.getFirstName())) {
//				if (students.get(i).getLastName().equals(tempStudent.getLastName())) {
//					if (students.get(i).getEmail().equals(tempStudent.getEmail())) {
//						isStudentPresent = true;
//					}
//				}
//			}
//		}

//		System.out.println(tempStudent);
		if (!isStudentPresent) {
			studentDbUtil.addStudent(tempStudent);
		}
		response.sendRedirect(request.getContextPath() + "/StudentController");
//		listStudents(request, response);
	}

	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<Student> students = studentDbUtil.getAllStudents();
		request.setAttribute("students", students);
		RequestDispatcher dispatcher = request.getRequestDispatcher("list-student.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
