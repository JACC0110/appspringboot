package com.example.app.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getHelloMessage() {
        return "Proyecto Final \"\"Administración de Sistemas Operativos y DEVOPS\"\nEstudiante: Jesús Angel Camposeco Cárdenas";
    }
}
