package com.inti.service.impl;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.springframework.stereotype.Service;

import com.inti.service.interfaces.IMailingService;
import com.sun.mail.smtp.SMTPTransport;
@Service
public class MailingService implements IMailingService {
   private static final String SMTP_SERVER = "smtp.gmail.com";
   private static final String USERNAME = "electrotracker2030@gmail.com";
   private static final String PASSWORD = "electrotracker123";
   private static final String EMAIL_FROM = "electrotracker2030@gmail.com";
    
   @Override
    public void sendEmail(String address, String subject, String content) {
        
       Properties prop = System.getProperties();
       prop.put("mail.smtp.host", SMTP_SERVER); //optional, defined in SMTPTransport
       prop.put("mail.smtp.auth", "true");
       prop.put("mail.smtp.starttls.enable", "true");
       prop.put("mail.smtp.port", "587"); // default port 25
       Session session = Session.getInstance(prop, null);
       Message msg = new MimeMessage(session);
        
         try {
            msg.setFrom(new InternetAddress(EMAIL_FROM));
            
           msg.setRecipients(Message.RecipientType.TO,
                   InternetAddress.parse(address, false));
           msg.setSubject(subject);
           // text
           MimeBodyPart p1 = new MimeBodyPart();
           p1.setText(content);
           Multipart mp = new MimeMultipart();
           mp.addBodyPart(p1);
           msg.setContent(mp);
            
            SMTPTransport t = (SMTPTransport) session.getTransport("smtp");
            // connect
           t.connect(SMTP_SERVER, USERNAME, PASSWORD);
            
            // send
           t.sendMessage(msg, msg.getAllRecipients());
            
           System.out.println("Response: " + t.getLastServerResponse());
           t.close();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}