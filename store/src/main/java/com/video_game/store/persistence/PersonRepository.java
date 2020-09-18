package com.video_game.store.persistence;

import com.video_game.store.model.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface PersonRepository extends CrudRepository<Person, Integer>{
}
