package com.aurionpro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aurionpro.model.User;
import com.aurionpro.service.EmailService;

import jakarta.mail.MessagingException;

@RestController
@RequestMapping("mail")
public class MyController {

	@Autowired
	private EmailService notificationService;

	@Autowired
	private User user;

	@GetMapping("/send-mail")
	public String send(@RequestParam String id, String subject, String body) {

		user.setEmailAddress(id);  
		try {
			notificationService.sendEmail(user,subject,body);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your mail has been send to the "+id;
	}

	@GetMapping("/send-mail-attachment")
	public String sendWithAttachment(@RequestParam String id, String subject, String body, String filename) throws MessagingException {

		user.setEmailAddress(id);

		try {
			notificationService.sendEmailWithAttachment(user,subject,body,filename);
		} catch (MailException mailException) {
			System.out.println(mailException);
		}
		return "Congratulations! Your attachment mail has been send to the "+id;
	}
}
