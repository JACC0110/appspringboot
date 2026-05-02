package com.example.app.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getHelloMessage() {
        return "Proyecto Final \"Administracion de Sistemas Operativos y DEVOPS\"\nEstudiante: Jesus Angel Camposeco Cardenas";
    }
}
