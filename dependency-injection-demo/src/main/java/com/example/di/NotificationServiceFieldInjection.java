package com.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceFieldInjection {
    
    @Autowired
    private EmailService emailService;
    
    public void sendEmail(String msg) {
        System.out.println("=== Field Injection ===");
        emailService.sendEmail(msg);
    }
}
