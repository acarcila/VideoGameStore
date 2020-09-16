package com.videogame.store.api;

import com.videogame.store.controller.IControllerApi;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebAPITest {
    private IWebApi webApi;
    //private final IControllerApi controller;
    @BeforeAll
    void init()
    {
        webApi = new WebAPI(null);
    }
    @Test
    void hello() {
    }

    @Test
    void bye() {
    }
}