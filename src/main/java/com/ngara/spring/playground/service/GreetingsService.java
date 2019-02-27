package com.ngara.spring.playground.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GreetingsService {

    private final GreetingsMapper mapper;

    public GreetingsService(GreetingsMapper mapper) {
        this.mapper = mapper;
    }

    public String sendPersonalizeGreetings(String userName) {

        return mapper.personalizeGreetings(userName);

    }
}
