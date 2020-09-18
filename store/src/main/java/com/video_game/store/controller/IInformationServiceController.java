package com.video_game.store.controller;

import com.video_game.store.model.dto.ClientDTO;
import com.video_game.store.model.dto.RentalDTO;
import com.video_game.store.model.dto.VideoGameDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface IInformationServiceController {
    Iterable<ClientDTO> findClientsOrderedByRentals(Integer limit);

    Iterable<VideoGameDTO> findVideoGamesOrderedByRentals(Integer limit);

    Iterable<RentalDTO> findRentalsByTime(Integer startTimestamp, Integer endTimestamp);

    Iterable<VideoGameDTO> findVideoGamesByCharacter(String characterName);

    Iterable<VideoGameDTO> findVideoGamesByDirector(String directorName);

    Iterable<VideoGameDTO> findVideoGamesByProducer(String producerName);

    Iterable<VideoGameDTO> findVideoGamesByCompany(String companyName);

    Iterable<VideoGameDTO> findVideoGamesByLeastRented();

    Iterable<RentalDTO> findRentalsByClient(String identificationNumber);

    Iterable<VideoGameDTO> findVideoGamesByClient(String identificationNumber);
}
