package com.video_game.store.utils;

import com.video_game.store.model.dto.*;
import com.video_game.store.model.entities.*;

public class FactoryModel {
    public static ClientDTO convert(Client client) {
        return new ClientDTO(
                client.getIdClient(),
                client.getName(),
                client.getEmail(),
                client.getPhoneNumber(),
                client.getAddress(),
                client.getBirthdayTimestamp(),
                client.getIdentificationNumber()
        );
    }

    public static Client convert(ClientDTO clientDTO) {
        Client client = new Client();
        client.setIdClient(clientDTO.getIdClient());
        client.setName(clientDTO.getName());
        client.setEmail(clientDTO.getEmail());
        client.setPhoneNumber(clientDTO.getPhoneNumber());
        client.setAddress(clientDTO.getAddress());
        client.setBirthdayTimestamp(clientDTO.getBirthdayTimestamp());
        client.setIdentificationNumber(clientDTO.getIdentificationNumber());
        return client;
    }

    public static CompanyDTO convert(Company company) {
        return new CompanyDTO(company.getIdCompany(), company.getName());
    }

    public static Company convert(CompanyDTO companyDTO) {
        Company company = new Company();
        company.setIdCompany(company.getIdCompany());
        company.setName(company.getName());
        return company;
    }

    public static RentalDTO convert(Rental rental) {
        return new RentalDTO.Builder()
                .withIDRental(rental.getIdRental())
                .withTimestamp(rental.getTimestamp())
                .withDuration(rental.getDuration())
                .withPrice(rental.getPrice())
                .withReturned(rental.getIsReturned())
                .withFkClient(rental.getClient().getIdClient())
                .withFkVideoGame(rental.getVideoGame().getIdVideoGame())
                .build();
    }

    public static Rental convert(RentalDTO rentalDTO, Client client, VideoGame videoGame) {
        Rental rental = new Rental();
        rental.setIdRental(rentalDTO.getIdRental());
        rental.setTimestamp(rentalDTO.getTimestamp());
        rental.setDuration(rentalDTO.getDuration());
        rental.setPrice(rentalDTO.getPrice());
        rental.setIsReturned(rentalDTO.getIsReturned());
        rental.setClient(client);
        rental.setVideoGame(videoGame);
        return rental;
    }

    public static TechnologyDTO convert(Technology technology) {
        return new TechnologyDTO(
                technology.getIdTechnology(),
                technology.getName(),
                technology.getCompany().getIdCompany()
        );
    }

    public static Technology convert(TechnologyDTO technologyDTO, Company company) {
        Technology technology = new Technology();
        technology.setIdTechnology(technologyDTO.getIdTechnology());
        technology.setName(technologyDTO.getName());
        technology.setCompany(company);
        return technology;
    }

    public static VideoGameDTO convert(VideoGame videoGame) {
        return new VideoGameDTO.Builder()
                .withIdVideoGame(videoGame.getIdVideoGame())
                .withName(videoGame.getName())
                .withYear(videoGame.getYear())
                .withRentalPrice(videoGame.getRentalPrice())
                .withFkTechnology(videoGame.getTechnology().getIdTechnology())
                .withFkCompany(videoGame.getCompany().getIdCompany())
                .withFkDirector(videoGame.getDirector().getIdPerson())
                .withFkProducer(videoGame.getProducer().getIdPerson())
                .build();
    }

    public static VideoGame convert(VideoGameDTO videoGameDTO, Technology technology, Company company, Person director, Person producer) {
        VideoGame videoGame = new VideoGame();
        videoGame.setIdVideoGame(videoGameDTO.getIdVideoGame());
        videoGame.setName(videoGameDTO.getName());
        videoGame.setYear(videoGameDTO.getYear());
        videoGame.setRentalPrice(videoGameDTO.getRentalPrice());
        videoGame.setTechnology(technology);
        videoGame.setCompany(company);
        videoGame.setDirector(director);
        videoGame.setProducer(producer);
        return videoGame;
    }
}
