package com.inti.service.interfaces;

public interface IMailingService {
	public void sendEmail(String address, String subject,  String content);
}
