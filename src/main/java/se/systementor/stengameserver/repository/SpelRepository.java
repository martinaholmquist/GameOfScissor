package se.systementor.stengameserver.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import se.systementor.stengameserver.models.Game;

import java.util.List;

public interface SpelRepository<id> extends CrudRepository<Game,  Integer> {

    @Query("SELECT COUNT(g) FROM Game g WHERE g.winner = :winner")
    long countByWinner(@Param("winner") String winner);



    @Override
    List<Game> findAll();
}
