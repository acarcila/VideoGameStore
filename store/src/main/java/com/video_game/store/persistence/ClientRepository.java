package com.video_game.store.persistence;

import com.video_game.store.model.entities.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


@Service
public interface ClientRepository extends CrudRepository<Client, Integer> {
    @Query(
            value = "SELECT c.* FROM client c, rental r where r.fk_client=c.id_client GROUP BY r.fk_client ORDER BY -COUNT(*) LIMIT ?1",
            nativeQuery = true
    )
    public Iterable<Client> findClientsOrderedByRentals(Integer limit);
}
