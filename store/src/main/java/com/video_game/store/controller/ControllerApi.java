package com.video_game.store.controller;

import com.video_game.store.model.entities.Client;
import com.video_game.store.model.entities.Technology;
import com.video_game.store.persistence.ClientRepository;
import com.video_game.store.persistence.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControllerApi implements IControllerApi{
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private TechnologyRepository technologyRepository;

    @Override
    public String greetings(String genre) {
        return "buenas ".concat(genre);
    }

    @Override
    public Iterable<Client> findAllClients() {
        return clientRepository.findAll();
    }
}
