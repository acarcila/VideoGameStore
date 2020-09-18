package com.video_game.store.controller;

import com.video_game.store.model.dto.ClientDTO;
import com.video_game.store.model.dto.RentalDTO;
import com.video_game.store.model.dto.VideoGameDTO;
import com.video_game.store.model.entities.Client;
import com.video_game.store.model.entities.Rental;
import com.video_game.store.model.entities.VideoGame;
import com.video_game.store.persistence.ClientRepository;
import com.video_game.store.persistence.RentalRepository;
import com.video_game.store.persistence.VideoGameRepository;
import com.video_game.store.utils.FactoryModel;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class InformationServiceController implements IInformationServiceController{
    private final ClientRepository clientRepository;
    private final VideoGameRepository videoGameRepository;
    private final RentalRepository rentalRepository;

    public InformationServiceController(final ClientRepository clientRepository, final VideoGameRepository videoGameRepository, final RentalRepository rentalRepository) {
        this.clientRepository = clientRepository;
        this.videoGameRepository = videoGameRepository;
        this.rentalRepository = rentalRepository;
    }

    @Override
    public Iterable<ClientDTO> findClientsOrderedByRentals(Integer limit) {
        Iterable<Client> clientList = clientRepository.findClientsOrderedByRentals(limit);
        List<ClientDTO> clientDTOList = new LinkedList<>();
        for(Client client: clientList)
        {
            clientDTOList.add(FactoryModel.convert(client));
        }
        return clientDTOList;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesOrderedByRentals(Integer limit) {
        Iterable<VideoGame> videoGamesList = videoGameRepository.findVideoGamesOrderedByRentals(limit);
        List<VideoGameDTO> videoGameDTOList = new LinkedList<>();
        for(VideoGame videoGame: videoGamesList)
        {
            videoGameDTOList.add(FactoryModel.convert(videoGame));
        }
        return videoGameDTOList;
    }

    @Override
    public Iterable<RentalDTO> findRentalsByTime(Integer startTimestamp, Integer endTimestamp) {
        Iterable<Rental> rentalList = rentalRepository.findRentalsByTime(startTimestamp, endTimestamp);
        List<RentalDTO> rentalDTOList = new LinkedList<>();
        for(Rental rental: rentalList)
        {
            rentalDTOList.add(FactoryModel.convert(rental));
        }
        return rentalDTOList;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByCharacter(String characterName) {
        Iterable<VideoGame> videoGamesList = videoGameRepository.findVideoGamesByCharacter(characterName);
        List<VideoGameDTO> videoGameDTOList = new LinkedList<>();
        for(VideoGame videoGame: videoGamesList)
        {
            videoGameDTOList.add(FactoryModel.convert(videoGame));
        }
        return videoGameDTOList;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByDirector(String directorName) {
        Iterable<VideoGame> videoGamesList = videoGameRepository.findVideoGamesByDirector(directorName);
        List<VideoGameDTO> videoGameDTOList = new LinkedList<>();
        for(VideoGame videoGame: videoGamesList)
        {
            videoGameDTOList.add(FactoryModel.convert(videoGame));
        }
        return videoGameDTOList;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByProducer(String producerName) {
        Iterable<VideoGame> videoGamesList = videoGameRepository.findVideoGamesByProducer(producerName);
        List<VideoGameDTO> videoGameDTOList = new LinkedList<>();
        for(VideoGame videoGame: videoGamesList)
        {
            videoGameDTOList.add(FactoryModel.convert(videoGame));
        }
        return videoGameDTOList;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByCompany(String companyName) {
        Iterable<VideoGame> videoGamesList = videoGameRepository.findVideoGamesByCompany(companyName);
        List<VideoGameDTO> videoGameDTOList = new LinkedList<>();
        for(VideoGame videoGame: videoGamesList)
        {
            videoGameDTOList.add(FactoryModel.convert(videoGame));
        }
        return videoGameDTOList;
    }

//    @Override
//    public Iterable<VideoGameDTO> findVideoGamesByLeastRented() {
//        Iterable<VideoGame> videoGamesList = videoGameRepository.();
//        List<VideoGameDTO> videoGameDTOList = new LinkedList<>();
//        for(VideoGame videoGame: videoGamesList)
//        {
//            videoGameDTOList.add(FactoryModel.convert(videoGame));
//        }
//        return videoGameDTOList;
//    }
    @Override
    public Iterable<VideoGameDTO> findVideoGamesByLeastRented() {
        return null;
    }

    @Override
    public Iterable<RentalDTO> findRentalsByClient(String identificationNumber) {
        Iterable<Rental> rentalList = rentalRepository.findRentalsByClient(identificationNumber);
        List<RentalDTO> rentalDTOList = new LinkedList<>();
        for(Rental rental: rentalList)
        {
            rentalDTOList.add(FactoryModel.convert(rental));
        }
        return rentalDTOList;
    }

    @Override
    public Iterable<VideoGameDTO> findVideoGamesByClient(String identificationNumber) {
        Iterable<VideoGame> videoGamesList = videoGameRepository.findVideoGamesByClient(identificationNumber);
        List<VideoGameDTO> videoGameDTOList = new LinkedList<>();
        for(VideoGame videoGame: videoGamesList)
        {
            videoGameDTOList.add(FactoryModel.convert(videoGame));
        }
        return videoGameDTOList;
    }
}
