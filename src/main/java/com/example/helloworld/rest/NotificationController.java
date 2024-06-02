package com.example.helloworld.rest;

import com.example.helloworld.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    private MessageService service;
    @Autowired
    public NotificationController(MessageService service) {
        this.service = service;
    }

    @GetMapping("/send-phone")
    public String sendPhone() {
        return this.service.sendMessage();
    }
}
