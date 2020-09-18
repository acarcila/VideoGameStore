package com.video_game.store.persistence;

import com.video_game.store.model.entities.Rental;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface RentalRepository extends CrudRepository<Rental, Integer> {
}
