package com.example.di;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    
    @Override
    public void sendEmail(String msg) {
        System.out.println("Sending email: " + msg);
        System.out.println("Email sent successfully!");
    }
}
