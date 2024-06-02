package com.example.helloworld.rest;

import com.example.helloworld.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    private MessageService service;
    private MessageService service2;
    @Autowired
    public NotificationController(
            @Qualifier("emailService") MessageService service,
            @Qualifier("emailService") MessageService service2) {
        this.service = service;
        this.service2 = service2;
    }

    @GetMapping("/send-message")
    public String sendMessage() {
        return this.service.sendMessage();
    }

    @GetMapping("/check")
    public String check() {
        return "Kiem tra " + (service == service2);
    }

    @GetMapping("/check2")
    public String check2() {
        if (service == service2) return "Singleton";
        else return "Prototype";
    }

}
