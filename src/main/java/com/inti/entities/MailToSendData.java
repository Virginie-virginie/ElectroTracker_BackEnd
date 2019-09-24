package com.inti.entities;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MailToSendData {
    private String subject;
    private String content;
    private String address;
    private String attachement;
}