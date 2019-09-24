package com.inti.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.inti.entities.MailToSendData;
import com.inti.service.interfaces.IMailingService;
@RestController
@RequestMapping(value="/mail")
@CrossOrigin(origins = "http://localhost:4200")
public class MailingController {
    
    @Autowired
    IMailingService mailingService;
    
    @PostMapping(value = "send")
    public void sendEmailService(@RequestBody MailToSendData mailData) {
        mailingService.sendEmail(mailData.getAddress(), mailData.getSubject(), mailData.getContent());
    }
}