package com.aurionpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.aurionpro.model.User;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.ClassPathResource;


@Service
public class EmailService {

	private JavaMailSender javaMailSender;

	@Autowired
	public EmailService(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	public void sendEmail(User user, String subject, String body) throws MailException {

		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(user.getEmailAddress());
		mail.setSubject(subject);
		mail.setText(body);

		javaMailSender.send(mail);
	}

	public void sendEmailWithAttachment(User user, String subject, String body, String filename) throws MailException, MessagingException {

		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

		helper.setTo(user.getEmailAddress());
		helper.setSubject(subject);
		helper.setText(body);

		ClassPathResource classPathResource = new ClassPathResource(filename);
		helper.addAttachment(classPathResource.getFilename(), classPathResource);

		javaMailSender.send(mimeMessage);
	}

}
