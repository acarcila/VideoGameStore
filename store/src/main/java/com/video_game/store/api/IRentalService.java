package com.video_game.store.api;

import com.video_game.store.model.dto.ClientDTO;
import com.video_game.store.model.dto.RentalDTO;
import com.video_game.store.model.dto.VideoGameDTO;
import com.video_game.store.model.entities.Client;
import com.video_game.store.model.entities.Rental;
import com.video_game.store.model.entities.VideoGame;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

public interface IRentalService {
    @PostMapping(path = "/client")
    @ResponseBody
    ClientDTO insertClient(@RequestBody ClientDTO clientDTO);

    @PostMapping(path = "/rental")
    @ResponseBody
    RentalDTO insertRental(@RequestBody RentalDTO rentalDTO);

    @PutMapping(path = "/video_game")
    @ResponseBody
    VideoGameDTO updateVideoGame(@RequestBody VideoGameDTO videoGameDTO);
}