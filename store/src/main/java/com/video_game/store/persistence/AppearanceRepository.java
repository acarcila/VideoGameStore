package com.video_game.store.persistence;

import com.video_game.store.model.entities.Appearance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AppearanceRepository extends CrudRepository<Appearance, Integer> {
}
