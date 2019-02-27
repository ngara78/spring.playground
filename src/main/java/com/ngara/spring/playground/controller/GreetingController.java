package com.ngara.spring.playground.controller;

import com.ngara.spring.playground.service.GreetingsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingController {

    private final GreetingsService greetingsService;

    public GreetingController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @GetMapping
    public String getGenericGreetings() {
        return "Hello, Wellcome to this site.";
    }

    @GetMapping("/{name}")
    public String getUserGreetings(@PathVariable(name = "name") final String name) {
        return greetingsService.sendPersonalizeGreetings(name);
    }
}
