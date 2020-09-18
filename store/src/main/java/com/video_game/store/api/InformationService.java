package com.video_game.store.api;

import com.video_game.store.model.dto.ClientDTO;
import com.video_game.store.model.dto.RentalDTO;
import com.video_game.store.model.dto.VideoGameDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(("/information_service"))
public class InformationService implements IInformationService{
    @Override
    public Iterable<ClientDTO> findClientsOrderedByRentals(Integer limit) {
        return null;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesOrderedByRentals(Integer limit) {
        return null;
    }

    @Override
    public Iterable<RentalDTO> findRentalsByTime(Integer startTimestamp, Integer endTimestamp) {
        return null;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByCharacter(String characterName) {
        return null;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByDirector(String directorName) {
        return null;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByProducer(String producerName) {
        return null;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByCompany(String companyName) {
        return null;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByLeastRented() {
        return null;
    }

    @Override
    public Iterable<RentalDTO> findRentalsByClient(String identificationNumber) {
        return null;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByClient(String identificationNumber) {
        return null;
    }
}
