package com.example.app.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.app.demo.services.HelloService;

@RestController
public class HelloController {

    private final HelloService helloService;

// Change 38

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

// Endpoint to return a greeting message
    @GetMapping("/hello")
    public String hello() {
        return helloService.getHelloMessage();
    }
}