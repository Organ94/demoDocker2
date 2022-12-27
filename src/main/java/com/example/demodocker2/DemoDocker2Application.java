package com.example.demodocker2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoDocker2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoDocker2Application.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from container! ver.2";
    }
}
