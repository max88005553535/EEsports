package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorld {
    @GetMapping("n")
    public String getNumbers(@RequestParam(value = "q") String n) {
        return "hello " + n;
    }
}