package com.example.github_action_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String home() {
        return "Hello, World! Aoutomated deployment with GitHub Actions!";
    }
}
