package com.dev.wsmail.service;

import org.example.wsmails.Mail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService implements IMailService {

	private static final Logger log = LoggerFactory.getLogger(MailService.class);
		
	@Autowired
	private JavaMailSender javaMailSender;
		
	@Value("${spring.mail.username}")
	private String from;
	
	@Override
	public boolean sendMail(Mail mail) {
		SimpleMailMessage message = new SimpleMailMessage();
		
        message.setFrom(from);
        message.setSubject(mail.getSubject());
        message.setText(mail.getText());
        message.setTo(mail.getTo());
        
        try {
            javaMailSender.send(message);
            return true;
        } catch (Exception e) {
            log.error("failed to send mail[{}],{}", mail, e.getMessage());
            return false;
        }
        
	}
	
}
