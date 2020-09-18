package com.video_game.store.api;

import com.video_game.store.util.MockedControllerApi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebAPITest {
    private IWebApi webApi;
    private MockedControllerApi controller;

    @BeforeEach
    void setUp() {
        controller = new MockedControllerApi();
        webApi = new WebAPI(controller);
    }

    @Test
    void helloWhenGenreIsMan() {
        String genre = "hombre";
        String hello = webApi.hello(genre);
        assertTrue(hello.contains(genre));
    }

    @Test
    void helloWhenGenreIsWoman() {
        String genre = "mujer";
        String hello = webApi.hello(genre);
        assertTrue(hello.contains(genre));
    }

    @Test
    void helloWhenGenreIsTrans() {
        String genre = "trans";
        String hello = webApi.hello(genre);
        assertTrue(hello.contains(genre));
    }

    @Test
    void helloWhenGenreIsWrong() {
        String genre = "wrong";
        String hello = webApi.hello(genre);
        assertEquals("género desconocido", hello);
    }

    @Test
    void bye() {
        String bye = webApi.bye();
        assertEquals("bye", bye);
    }
}