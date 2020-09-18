package com.video_game.store.api;

import com.video_game.store.model.entities.Client;
import com.video_game.store.model.entities.Rental;
import com.video_game.store.model.entities.Technology;
import org.springframework.web.bind.annotation.*;


public interface IWebApi {
    @RequestMapping(value = "/hello/{genre}", method = RequestMethod.GET)
    String hello(@PathVariable String genre);

    @RequestMapping(value = "/bye", method = RequestMethod.POST)
    String bye();

    @GetMapping(path = "/clients")
    @ResponseBody
    Iterable<Client> findAllClients();
}
