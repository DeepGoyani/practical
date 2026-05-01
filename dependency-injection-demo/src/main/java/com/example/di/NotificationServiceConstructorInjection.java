package com.example.di;

import org.springframework.stereotype.Service;

@Service
public class NotificationServiceConstructorInjection {
    
    private final EmailService emailService;
    
    public NotificationServiceConstructorInjection(EmailService emailService) {
        this.emailService = emailService;
    }
    
    public void sendEmail(String msg) {
        System.out.println("=== Constructor Injection ===");
        emailService.sendEmail(msg);
    }
}
