package com.example.repairs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {
    @GetMapping( path = "/hello")
    public String getGreeting(@RequestParam(name = "name") Optional<String> name) {
        return name.map(s -> "Hello " + s).orElse("Hello World");
    }

}
