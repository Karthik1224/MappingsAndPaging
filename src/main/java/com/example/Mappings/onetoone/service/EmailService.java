package com.example.Mappings.onetoone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendSimpleMail()
	{
		SimpleMailMessage details = new SimpleMailMessage();
		String body = "Hi, Durgam Karthik"+"\n"+"Welcome to our services"+"\n" +"Thanks for choosing us...";
		details.setSubject("Client Visit");
		details.setFrom("karthikd20009@gmail.com");
		details.setTo("durgamkarthik150@gmail.com");
		details.setText(body);
		javaMailSender.send(details);
		
	}
}
