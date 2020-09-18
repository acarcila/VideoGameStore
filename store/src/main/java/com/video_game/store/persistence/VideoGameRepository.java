package com.video_game.store.persistence;

import com.video_game.store.model.dto.VideoGameDTO;
import com.video_game.store.model.entities.VideoGame;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface VideoGameRepository extends CrudRepository<VideoGame, Integer> {
    @Query(
            value = "SELECT v.* FROM video_game v, rental r where r.fk_video_game=v.id_video_game GROUP BY r.fk_video_game ORDER BY -COUNT(*) LIMIT ?1",
            nativeQuery = true
    )
    public Iterable<VideoGame> findVideoGamesOrderedByRentals(Integer limit);

    @Query(
            value = "SELECT vg.* FROM video_game vg, appearance a, video_game_store.character c WHERE a.fk_video_game=vg.id_video_game AND a.fk_character=c.id_character AND c.name = ?1",
            nativeQuery = true
    )
    public Iterable<VideoGame> findVideoGamesByCharacter(String characterName);

    @Query(
            value = "SELECT vg.* FROM video_game vg, person d WHERE vg.fk_director=d.id_person AND d.name = ?1",
            nativeQuery = true
    )
    public Iterable<VideoGame> findVideoGamesByDirector(String directorName);

    @Query(
            value = "SELECT vg.* FROM video_game vg, person p WHERE vg.fk_producer=p.id_person AND p.name = ?1",
            nativeQuery = true
    )
    public Iterable<VideoGame> findVideoGamesByProducer(String producerName);

    @Query(
            value = "SELECT vg.* FROM video_game vg, company c WHERE vg.fk_company=c.id_company AND c.name = ?1",
            nativeQuery = true
    )
    public Iterable<VideoGame> findVideoGamesByCompany(String companyName);

    @Query(
            value = "SELECT vg.* FROM video_game vg, rental r, client c WHERE r.fk_client=c.id_client AND r.fk_video_game=vg.id_video_game AND c.identification_number=?1",
            nativeQuery = true
    )
    public Iterable<VideoGame> findVideoGamesByClient(String identificationNumber);
}
