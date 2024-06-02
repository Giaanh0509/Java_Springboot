package com.example.helloworld.service;
import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService {
    public EmailService() {
        System.out.println("EmailService");
    }
    @Override
    public String sendMessage() {
        return "Email sending ...";
    }
}
