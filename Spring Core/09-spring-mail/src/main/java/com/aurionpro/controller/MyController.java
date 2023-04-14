package com.aurionpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.aurionpro.service.EmailService;

@Controller
public class MyController {

	@Autowired
	private EmailService emailService;

	@GetMapping(value = "/sendmail")
	public String sendmail() {

		emailService.sendMail("ab12345ja@gmail.com", "Test Subject", "Test mail");
		return "Mail Sent successfully";
//		return "emailsent";
//          return "redirect:/index2";
//		return "<h1>success: \" + Mail Sent Successfully + \"</h1>";
	}
}
