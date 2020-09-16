package com.videogame.store.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.websocket.server.PathParam;


public interface IWebApi {
    @RequestMapping(value = "${service.movies.retrieve}/hello/{genre}", method = RequestMethod.GET)
    String hello(@PathVariable String genre);

    @RequestMapping(value = "${service.movies.retrieve}/bye", method = RequestMethod.POST)
    String bye();
}
