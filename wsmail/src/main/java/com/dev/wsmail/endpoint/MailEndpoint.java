package com.dev.wsmail.endpoint;

import org.example.wsmails.Mail;
import org.example.wsmails.SendMailRequest;
import org.example.wsmails.SendMailResponse;
import org.example.wsmails.ServiceStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.dev.wsmail.service.IMailService;

@Endpoint
public class MailEndpoint {

	private static final String NAMESPACE_URI = "http://www.example.org/wsmails";
	
	@Autowired
	private IMailService mailService;
	
	@Autowired
	public MailEndpoint(IMailService mailService) {
		this.mailService = mailService;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "sendMailRequest")
	@ResponsePayload
	public SendMailResponse sendMail(@RequestPayload SendMailRequest request) {
		
		SendMailResponse response = new SendMailResponse();
		ServiceStatus serviceStatus = new ServiceStatus();
		
		Mail mail = new Mail();
		
		mail.setTo(request.getTo());
		mail.setSubject(request.getSubject());
		mail.setText(request.getText());
		
		boolean flag = mailService.sendMail(mail);
		
		if (flag == false) {
     	   serviceStatus.setStatusCode("CONFLICT");
     	   serviceStatus.setMessage("!Error al enviar el correo");
     	   response.setServiceStatus(serviceStatus);
        } else {
           serviceStatus.setStatusCode("SUCCES");
           serviceStatus.setMessage("!Correo enviado con exito");
           response.setServiceStatus(serviceStatus);
        }
		
		return response;
	}
	
}

