package com.video_game.store.persistence;

import com.video_game.store.model.entities.Character;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface CharacterRepository extends CrudRepository<Character, Integer> {
}
