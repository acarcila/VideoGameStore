package com.video_game.store.persistence;

import com.video_game.store.model.entities.Rental;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface RentalRepository extends CrudRepository<Rental, Integer> {
    @Query(
            value = "SELECT * FROM rental r WHERE r.timestamp between ?1 AND ?2",
            nativeQuery = true
    )
    public Iterable<Rental> findRentalsByTime(Integer startTimestamp, Integer endTimestamp);

    @Query(
            value = "SELECT r.* FROM rental r, client c WHERE r.fk_client=c.id_client AND c.identification_number=?1",
            nativeQuery = true
    )
    public Iterable<Rental> findRentalsByClient(String identificationNumber);
}
