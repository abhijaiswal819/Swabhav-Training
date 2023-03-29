package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SessionDemo() {
        super();
    }
    
	int old = 1;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("count", old);
		session.setMaxInactiveInterval(30*60);
		if(session.getAttribute("count") != null){
			out.println("<h2>"+"Old Count : "+session.getAttribute("count")+"</h2>");
			old++;
			session.setAttribute("count", old);
			out.println("<h2>"+"New Count : "+session.getAttribute("count")+"</h2>");
		}
		
	
	}

}
