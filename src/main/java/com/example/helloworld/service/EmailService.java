package com.example.helloworld.service;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class EmailService implements MessageService {
    public EmailService() {
        System.out.println("EmailService");
    }
    @Override
    public String sendMessage() {
        return "Email sending ...";
    }
}
