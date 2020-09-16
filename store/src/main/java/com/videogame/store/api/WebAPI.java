package com.videogame.store.api;

import com.videogame.store.controller.IControllerApi;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Predicate;

@RestController
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
}
