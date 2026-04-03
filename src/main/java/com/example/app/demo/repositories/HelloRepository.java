package com.example.app.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.app.demo.entities.Hello;

public interface HelloRepository extends JpaRepository<Hello, Long> {
}