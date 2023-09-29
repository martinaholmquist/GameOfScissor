package se.systementor.stengameserver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.systementor.stengameserver.models.Game;
import se.systementor.stengameserver.models.Statistics;
import se.systementor.stengameserver.repository.SpelRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class StatisticsService {

    @Autowired
    //containern gör en abstraction som gör att det new:ar per automatik   Lagt till denna för refaktor av classer
     SpelRepository spelrepository;
    private static ArrayList<Game> games = new ArrayList<Game>();

    public void save(String winner, String yourSelection, String mySelection) {
        var game = new Game();
        game.setCreated(LocalDateTime.now());
        game.setMySelection(mySelection);
        game.setYourSelection(yourSelection);
        game.setWinner(winner);
        game.setId(games.size()+1);
        games.add(game);
        spelrepository.save(game);
    }

    public Statistics statistics() {
        long youWins = spelrepository.countByWinner("You");
        long computerWins = spelrepository.countByWinner("Computer");
        long ties = spelrepository.countByWinner("Tie");

        /*
        return "You Wins: " + youWins + "\n" +
                "Computer Wins: " + computerWins + "\n" +
                "Ties: " + ties;*/

        return new Statistics(youWins, computerWins, ties);

    }
}
