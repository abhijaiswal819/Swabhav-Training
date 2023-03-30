package com.aurionpro.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/JDBCTest")
public class JDBCTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public JDBCTest() {
        super();
    }

    @Resource(name="jdbc/studentdb")
    private DataSource datasource;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Step-1 Set up the printwriter
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		//Step-2 Get a connection to the database
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = datasource.getConnection();
			
			//Step-3 Create a SQL query
			String sql = "select * from student";
			myStmt = myConn.createStatement();
			
			//Step-4 Execute SQL query
			myRs = myStmt.executeQuery(sql);
			
			//Step-5 Process the result set
			List<Student> studentList = new ArrayList<Student>();
			
			while(myRs.next()) {
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
				studentList.add(new Student(id, firstName, lastName, email));
//				out.println(email);
			}
			//System.out.println(studentList);
			request.setAttribute("students", studentList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("list-student.jsp");
			dispatcher.forward(request, response);
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
