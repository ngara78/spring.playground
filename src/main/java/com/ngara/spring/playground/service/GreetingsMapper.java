package com.ngara.spring.playground.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingsMapper {

    public String personalizeGreetings(String userName) {
        return String.format("Hello %s, Wellcome to this site.", userName);
    }
}
