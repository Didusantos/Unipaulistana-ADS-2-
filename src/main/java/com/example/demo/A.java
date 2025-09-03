package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class A {
    @GetMapping(path = "/teste")
    public String teste(){
        return "Isso é um teste";
    }
}
