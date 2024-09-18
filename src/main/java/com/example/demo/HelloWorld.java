package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping()
    public String greet(@RequestParam(value = "q", defaultValue = "Maxim") String name) {
        return "Hi, " + name;
    }
}