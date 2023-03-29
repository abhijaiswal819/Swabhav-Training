package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CookieDemo")
public class CookieDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CookieDemo() {
		super();
	}

	int old = 1;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie ck = new Cookie("data", Integer.toString(old));
		response.addCookie(ck);
		ck.setMaxAge(30 * 60);

		if (request.getCookies() != null) {
			Cookie ckl[] = request.getCookies();
			for (Cookie tempCookie : ckl) {
				if ("data".equals(tempCookie.getName())) {
					out.println("<h2>" + "Old Count : " + tempCookie.getValue() + "</h2>");
					++old;					
//					out.println(old);
					ck = new Cookie("data", Integer.toString(old));
					response.addCookie(ck);
					out.println("<h2>" + "New Count : " + old + "</h2>");
				}
			}

		}
	}

}
