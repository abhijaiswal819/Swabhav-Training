package com.aurionpro.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


public class StudentDbUtil {

	private DataSource datasource;

	  public StudentDbUtil(DataSource datasource) {
	    super();
	    this.datasource = datasource;
}

	  public List<Student> getAllStudents() throws Exception {
		    Connection myConn = null;
		    Statement myStmt = null;
		    ResultSet myRs = null;
		    try {
		      myConn = datasource.getConnection();
		      String sql = "select * from student";
		      myStmt = myConn.createStatement();
		      myRs = myStmt.executeQuery(sql);

		      List<Student> studentList = new ArrayList<Student>();
		      while (myRs.next()) {
		        int id = myRs.getInt("id");
		        String firstname = myRs.getString("first_name");
		        String lastname = myRs.getString("last_name");
		        String email = myRs.getString("email");
		        studentList.add(new Student(id, firstname, lastname, email));
		      }
		      return studentList;

		    } finally {
		      close(myConn, myStmt, myRs);
		    }
		  }

		  private void close(Connection myConn, Statement myStmt, ResultSet myRs) throws Exception {
		    if (myConn != null)
		      myConn.close();
		    if (myStmt != null)
		      myStmt.close();
		    if (myRs != null)
		      myRs.close();
		  }
		}