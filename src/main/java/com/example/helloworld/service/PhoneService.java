package com.example.helloworld.service;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PhoneService implements MessageService {
    public PhoneService() {
        System.out.println("PhoneService");
    }
    @Override
    public String sendMessage() {
        return "Phone Sending ...";
    }
}
