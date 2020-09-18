package com.video_game.store.api;

import com.video_game.store.model.dto.ClientDTO;
import com.video_game.store.model.dto.RentalDTO;
import com.video_game.store.model.dto.VideoGameDTO;
import com.video_game.store.model.entities.Rental;
import com.video_game.store.model.entities.VideoGame;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface IInformationService {
    @GetMapping(path = "/clients/orderByRentals/{limit}")
    Iterable<ClientDTO> findClientsOrderedByRentals(@PathVariable Integer limit);

    @GetMapping(path = "/video_games/orderByRentals/{limit}")
    Iterable<VideoGameDTO> findVideoGamesOrderedByRentals(@PathVariable Integer limit);

    @GetMapping(path = "/Rentals/Time/{startTimestamp}/{endTimestamp}")
    Iterable<RentalDTO> findRentalsByTime(@PathVariable Integer startTimestamp, @PathVariable Integer endTimestamp);

    @GetMapping(path = "/video_games/byCharacter/{characterName}")
    Iterable<VideoGameDTO> findVideoGamesByCharacter(@PathVariable String characterName);

    @GetMapping(path = "/video_games/byDirector/{directorName}")
    Iterable<VideoGameDTO> findVideoGamesByDirector(@PathVariable String directorName);

    @GetMapping(path = "/video_games/byProducer/{producerName}")
    Iterable<VideoGameDTO> findVideoGamesByProducer(@PathVariable String producerName);

    @GetMapping(path = "/video_games/byCompany/{CompanyName}")
    Iterable<VideoGameDTO> findVideoGamesByCompany(@PathVariable String companyName);

    @GetMapping(path = "/video_games/leastRented/byAges")
    Iterable<VideoGameDTO> findVideoGamesByLeastRented();

    @GetMapping(path = "/rentals/byClient/{identificationNumber}")
    Iterable<RentalDTO> findRentalsByClient(@PathVariable String identificationNumber);

    @GetMapping(path = "/video_games/byClient/{identificationNumber}")
    Iterable<VideoGameDTO> findVideoGamesByClient(@PathVariable String identificationNumber);
}
