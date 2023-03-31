package com.aurionpro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

	public void updateStudent(Student tempStudent) {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		System.out.println(tempStudent);

		try {
			myConn = datasource.getConnection();
			String sql = "update student set first_name=?,last_name=?,email=? where id=?";
			myStmt = myConn.prepareStatement(sql);
			myStmt.setString(1, tempStudent.getFirstName());
			myStmt.setString(2, tempStudent.getLastName());
			myStmt.setString(3, tempStudent.getEmail());
			myStmt.setInt(4, tempStudent.getId());

			myStmt.execute();

			System.out.println("Updated");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, null);
		}
	}

	public Student getStudentById(int id) {
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRes = null;

		try {
			myConn = datasource.getConnection();
			String sql = "select * from student where id=?";

			myStmt = myConn.prepareStatement(sql);
			myStmt.setInt(1, id);

			myRes = myStmt.executeQuery();
//			System.out.println("Deleted");

			if (myRes.next()) {
//				int id = myRs.getInt("id");
				String firstname = myRes.getString("first_name");
				String lastname = myRes.getString("last_name");
				String email = myRes.getString("email");
				return new Student(id, firstname, lastname, email);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, null);
		}

		return null;
	}

	public void addStudent(Student tempStudent) {
		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			myConn = datasource.getConnection();
			String sql = "insert into student(first_name, last_name, email) values(?,?,?)";

			myStmt = myConn.prepareStatement(sql);
			myStmt.setString(1, tempStudent.getFirstName());
			myStmt.setString(2, tempStudent.getLastName());
			myStmt.setString(3, tempStudent.getEmail());

			myStmt.execute();
			System.out.println("Deleted");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, null);
		}
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

	private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
		try {
			if (myConn != null)
				myConn.close();
			if (myStmt != null)
				myStmt.close();
			if (myRs != null)
				myRs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}