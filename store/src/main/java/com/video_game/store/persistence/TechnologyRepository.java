package com.video_game.store.persistence;

import com.video_game.store.model.entities.Technology;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface TechnologyRepository extends CrudRepository<Technology, Integer> {
}
