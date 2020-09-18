package com.video_game.store.controller;

import com.video_game.store.model.dto.ClientDTO;
import com.video_game.store.model.dto.RentalDTO;
import com.video_game.store.model.dto.VideoGameDTO;
import com.video_game.store.model.entities.Client;
import com.video_game.store.model.entities.Rental;
import com.video_game.store.model.entities.VideoGame;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public interface IRentServiceController {
    ClientDTO insertClient(ClientDTO clientDTO);

    RentalDTO insertRental(RentalDTO rentalDTO);

    VideoGameDTO updateVideoGame(VideoGameDTO videoGameDTO);
}
