package com.video_game.store.controller;

import com.video_game.store.model.dto.ClientDTO;
import com.video_game.store.model.dto.RentalDTO;
import com.video_game.store.model.dto.VideoGameDTO;
import com.video_game.store.model.entities.Client;
import com.video_game.store.model.entities.Rental;
import com.video_game.store.model.entities.Technology;
import com.video_game.store.model.entities.VideoGame;
import com.video_game.store.persistence.ClientRepository;
import com.video_game.store.persistence.RentalRepository;
import com.video_game.store.persistence.TechnologyRepository;
import com.video_game.store.persistence.VideoGameRepository;
import com.video_game.store.utils.FactoryModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class RentServiceController implements IRentServiceController {
    private final ClientRepository clientRepository;
    private final RentalRepository rentalRepository;
    private final VideoGameRepository videoGameRepository;

    public RentServiceController(final ClientRepository clientRepository, final RentalRepository rentalRepository, final VideoGameRepository videoGameRepository) {
        this.clientRepository = clientRepository;
        this.rentalRepository = rentalRepository;
        this.videoGameRepository = videoGameRepository;
    }

    @Override
    public ClientDTO insertClient(ClientDTO clientDTO) {
        Client client = FactoryModel.convert(clientDTO);
        return FactoryModel.convert(clientRepository.save(client));
    }

    @Override
    public RentalDTO insertRental(RentalDTO rentalDTO) {
        Client client = clientRepository.findById(rentalDTO.getFkClient()).orElse(null);
        VideoGame videoGame = videoGameRepository.findById(rentalDTO.getFkVideoGame()).orElse(null);
        Rental rental = FactoryModel.convert(rentalDTO, client, videoGame);
        System.out.println(rental.getIdRental() + ", " + rental.getDuration() + ", " + rental.getClient().getName() + ", " + rental.getPrice());
        return FactoryModel.convert(rentalRepository.save(rental));
    }

    @Override
    public VideoGameDTO updateVideoGame(VideoGameDTO videoGameDTO) {
        VideoGame currentVideoGame = videoGameRepository.findById(videoGameDTO.getIdVideoGame()).orElse(null);
        VideoGame videoGame = FactoryModel.convert(videoGameDTO, currentVideoGame.getTechnology(), currentVideoGame.getCompany(), currentVideoGame.getDirector(), currentVideoGame.getProducer());

        BeanUtils.copyProperties(videoGame, currentVideoGame, getNullPropertyNames(videoGameDTO));

        return FactoryModel.convert(videoGameRepository.save(currentVideoGame));
    }

    public static String[] getNullPropertyNames(Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<String>();
        for (java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null) emptyNames.add(pd.getName());
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }
}
