package com.example.greeting.controllers;

import com.example.greeting.controllers.utils.StringUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/helloWorld")
    public String greeting() {
        return "Hello Stranger";
    }

    @GetMapping("/hello")
    public String greetingUser(@RequestParam String name) {
        return "Hello " + StringUtil.splitByCharacterTypeCamelCase(name);
    }

    @GetMapping("/author")
    public String getAuthor() {
        return "Zeynab Mortazavi";
    }
}
