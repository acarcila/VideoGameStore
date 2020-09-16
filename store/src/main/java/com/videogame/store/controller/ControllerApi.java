package com.videogame.store.controller;

import org.springframework.stereotype.Component;

@Component
public class ControllerApi implements IControllerApi{
    @Override
    public String greetings(String genre) {
        return "buenas ".concat(genre);
    }
}
