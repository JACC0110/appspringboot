package com.example.app.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hello {

    @Id
    private Long id;
    private String content;

    public Hello() {
    }

    public Hello(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
