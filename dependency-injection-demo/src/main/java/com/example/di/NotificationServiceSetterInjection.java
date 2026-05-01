package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceSetterInjection {
    
    private EmailService emailService;
    
    @Autowired
    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }
    
    public void sendEmail(String msg) {
        System.out.println("=== Setter Injection ===");
        emailService.sendEmail(msg);
    }
}
