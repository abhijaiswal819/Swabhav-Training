package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletContextDemo() {
		super();
	}

	int old = 1;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		ServletContext sc = getServletContext();		
		sc.setAttribute("data", old);
		
		if(sc.getAttribute("data") != null){
			out.println("<h2>"+"Old Count : "+sc.getAttribute("data")+"</h2>");
			old++;
			sc.setAttribute("data", old);
			out.println("<h2>"+"New Count : "+sc.getAttribute("data")+"</h2>");
		}
	}

}
