package com.example.app.demo;

import com.example.app.demo.controllers.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private HelloController helloController;

    @Test
    void contextLoads() {
        assertThat(helloController).isNotNull();
    }
}