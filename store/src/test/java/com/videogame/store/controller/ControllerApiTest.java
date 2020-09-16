package com.videogame.store.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerApiTest {
    private IControllerApi controller;
    @BeforeEach
    void setUp() {
        controller = new ControllerApi();
    }

    @Test
    void whenGenreIsMan() {
        String genre = "hombre";
        String greetings = controller.greetings(genre);
        assertTrue(greetings.contains(genre));
    }

    @Test
    void whenGenreIsWoman() {
        String genre = "mujer";
        String greetings = controller.greetings(genre);
        assertTrue(greetings.contains(genre));
    }

    @Test
    void whenGenreIsTrans() {
        String genre = "trans";
        String greetings = controller.greetings(genre);
        assertTrue(greetings.contains(genre));
    }

    @Test
    void whenGenreIsWrong() {
        String genre = "wrong";
        String greetings = controller.greetings(genre);
        assertTrue(greetings.contains(genre));
    }
}