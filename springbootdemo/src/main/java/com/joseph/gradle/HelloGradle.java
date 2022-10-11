package com.joseph.gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGradle {

    @GetMapping("/hello")
    public String hello() {
        return "spring boot with gradle is super easy";
    }
}
