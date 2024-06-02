package com.example.helloworld.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${khoahoc.ten}")
    private String ten;
    @Value("${khoahoc.huongdan}")
    private String huongdan;
    @Value("${khoahoc.website}")
    private String website;
    @GetMapping("/")
    public String index() {
        return "HelloWorld Anh yeu em" ;
    }

    @GetMapping("/info")
    public String info() {
        return "Tên" + ten + "<br />" + "Hướng dẫn" + huongdan + "<br />"  + "Website" + website + "<br />";
    }

}
