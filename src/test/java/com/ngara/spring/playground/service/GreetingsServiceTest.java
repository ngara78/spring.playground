package com.ngara.spring.playground.service;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GreetingsServiceTest {

    private GreetingsMapper mapper = mock(GreetingsMapper.class);
    private GreetingsService service = new GreetingsService(mapper);

    @Test
    public void sendPersonalizeGreetings() {
        //given
        when(mapper.personalizeGreetings(anyString())).thenReturn("Hola Pepe");
        //when
        String greetings = service.sendPersonalizeGreetings("Pepe");
        //then
        assertThat(greetings).isEqualTo("Pepe");
    }
}