package com.example.greeting.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/helloWorld")
    public String greeting() {
        return "Hello Stranger";
    }

    @GetMapping("/author")
    public String getAuthor() {
        return "Zeynab Mortazavi";
    }
}
