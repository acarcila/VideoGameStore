package com.video_game.store.api;

import com.video_game.store.controller.IControllerApi;
import com.video_game.store.model.entities.Client;
import com.video_game.store.model.entities.Technology;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Predicate;

@RestController
@RequestMapping("/test")
public class WebAPI implements IWebApi {
    private final IControllerApi controller;

    public WebAPI(final IControllerApi controller) {
        this.controller = controller;
    }

    @Override
    public String hello(String genre) {
        Predicate<String> genreValidator = gen -> "hombre".equals(gen)
                || "mujer".equals(gen)
                || "trans".equals(gen);

        return genreValidator.test(genre)
                ? controller.greetings(genre)
                : "género desconocido";
    }

    @Override
    public String bye() {
        return "bye";
    }

    @Override
    public @ResponseBody
    Iterable<Client> findAllClients() {
        return controller.findAllClients();
    }
}
