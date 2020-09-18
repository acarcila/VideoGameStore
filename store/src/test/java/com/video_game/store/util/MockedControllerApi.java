package com.video_game.store.util;

import com.video_game.store.controller.IControllerApi;
import com.video_game.store.model.entities.Client;
import com.video_game.store.model.entities.Technology;

public class MockedControllerApi implements IControllerApi {
    @Override
    public String greetings(String genre) {
        return "mocked message ".concat(genre);
    }

    @Override
    public Iterable<Client> findAllClients() {
        return null;
    }
}
