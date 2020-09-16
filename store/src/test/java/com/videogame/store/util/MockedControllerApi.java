package com.videogame.store.util;

import com.videogame.store.controller.IControllerApi;

public class MockedControllerApi implements IControllerApi {
    @Override
    public String greetings(String genre) {
        return "mocked message ".concat(genre);
    }
}
