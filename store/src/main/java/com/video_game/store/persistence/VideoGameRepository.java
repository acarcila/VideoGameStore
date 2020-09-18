package com.video_game.store.persistence;

import com.video_game.store.model.entities.VideoGame;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface VideoGameRepository extends CrudRepository<VideoGame, Integer> {
}
