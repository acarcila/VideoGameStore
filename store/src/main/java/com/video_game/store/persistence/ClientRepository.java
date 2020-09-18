package com.video_game.store.persistence;

import com.video_game.store.model.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ClientRepository extends CrudRepository<Client, Integer> {
}
