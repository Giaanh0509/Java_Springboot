package com.example.helloworld.util;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Until {
    @Bean
    public Calculator getCaculator() {
        return new Calculator();
    }
}
