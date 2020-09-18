package com.video_game.store.api;

import com.video_game.store.controller.IRentServiceController;
import com.video_game.store.model.dto.ClientDTO;
import com.video_game.store.model.dto.RentalDTO;
import com.video_game.store.model.dto.VideoGameDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/rental_service"))
public class RentalService implements IRentalService {
    private final IRentServiceController controller;

    public RentalService(final IRentServiceController controller) {
        this.controller = controller;
    }

    @Override
    public ClientDTO insertClient(ClientDTO clientDTO) {
        return controller.insertClient(clientDTO);
    }

    @Override
    public RentalDTO insertRental(RentalDTO rentalDTO) {
        return controller.insertRental(rentalDTO);
    }

    @Override
    public VideoGameDTO updateVideoGame(VideoGameDTO videoGameDTO) {
        return controller.updateVideoGame(videoGameDTO);
    }
}
