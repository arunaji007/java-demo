package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.aopalliance.*;
@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        System.out.println("test");
        return "OK";
    }
}
