package com.example.helloworld.rest;

import com.example.helloworld.util.Calculator;
import com.example.helloworld.util.Until;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UntilController {
    private Calculator calculator;

    @Autowired
    public UntilController(@Qualifier("getCaculator") Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/sqrt")
    public String tinhCanBacHai(@RequestParam("value") double x) {
        return "SQRT(" + x + ") = " + calculator.canBacHai(x);
    }

    @GetMapping("/pow")
    public String tinhBinhPhuong(@RequestParam("value") double x) {
        return "Pow(" + x + ") = " + calculator.binhPhuong(x);
    }
}
