package com.video_game.store.persistence;

import com.video_game.store.model.entities.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface CompanyRepository extends CrudRepository<Company, Integer> {
}
