package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class ApiControl {
    // 1) Current time
    @GetMapping("/time")
    public String getCurrentTime() {

        return LocalDateTime.now().toString();
    }

    // 2) from 1 to n
    @GetMapping("/num")
    public List<Integer> getNumbers(@RequestParam int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    // 3) random 1 to 500
    @GetMapping("/random")
    public int getRandomNumber() {
        return new Random().nextInt(500) + 1;
    }

    // 4) fibonacci
    @GetMapping("/fibonacci")
    public long getFibonacci(@RequestParam int n) {
        return fibonacci(n);
    }

    private long fibonacci(int n) {
        if (n <= 1) return n;
        long prev = 0, current = 1;
        for (int i = 2; i <= n; i++) {
            long fib = prev + current;
            prev = current;
            current = fib;
        }
        return current;
    }

    // 5) reverse
    @GetMapping("/reverse")
    public String reverseString(@RequestParam String word) {
        return new StringBuilder(word).reverse().toString();
    }
}