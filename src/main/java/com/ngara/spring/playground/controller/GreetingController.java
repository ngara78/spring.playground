package com.ngara.spring.playground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {

    @GetMapping
    public String getGenericGreetings() {
        return "Hello, Wellcome to this site.";
    }

    @GetMapping("/{name}")
    public String getUserGreetings(@PathVariable(name = "name") final String name) {
        return String.format("Hello %s, Wellcome to this site.", name);
    }
}
