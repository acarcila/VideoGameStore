package com.video_game.store.controller;

import com.video_game.store.model.entities.Client;
import com.video_game.store.model.entities.Technology;

public interface IControllerApi {
    String greetings(String genre);

    Iterable<Client> findAllClients();
}
