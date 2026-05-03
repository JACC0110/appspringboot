package com.example.app.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getHelloMessage() {
        return "test 37";
    }
}
