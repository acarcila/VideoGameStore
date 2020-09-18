package com.video_game.store.api;

import com.video_game.store.controller.IInformationServiceController;
import com.video_game.store.controller.IRentServiceController;
import com.video_game.store.model.dto.ClientDTO;
import com.video_game.store.model.dto.RentalDTO;
import com.video_game.store.model.dto.VideoGameDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/information_service"))
public class InformationService implements IInformationService {
    private final IInformationServiceController controller;

    public InformationService(final IInformationServiceController controller) {
        this.controller = controller;
    }

    @Override
    public Iterable<ClientDTO> findClientsOrderedByRentals(Integer limit) {
        return controller.findClientsOrderedByRentals(limit);
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesOrderedByRentals(Integer limit) {
        return controller.findVideoGamesOrderedByRentals(limit);
    }

    @Override
    public Iterable<RentalDTO> findRentalsByTime(Integer startTimestamp, Integer endTimestamp) {
        return controller.findRentalsByTime(startTimestamp, endTimestamp);
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByCharacter(String characterName) {
        return controller.findVideoGamesByCharacter(characterName);
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByDirector(String directorName) {
        return controller.findVideoGamesByDirector(directorName);
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByProducer(String producerName) {
        return controller.findVideoGamesByProducer(producerName);
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByCompany(String companyName) {
        return controller.findVideoGamesByCompany(companyName);
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByLeastRented() {
        return controller.findVideoGamesByLeastRented();
    }

    @Override
    public Iterable<RentalDTO> findRentalsByClient(String identificationNumber) {
        return controller.findRentalsByClient(identificationNumber);
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByClient(String identificationNumber) {
        return controller.findVideoGamesByClient(identificationNumber);
    }
}
