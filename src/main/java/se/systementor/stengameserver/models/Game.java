package se.systementor.stengameserver.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  //auto eller uuid
    int id;
    @Column(nullable = true)
    LocalDateTime created;
    @Column(nullable = true)
    String winner;
    @Column(nullable = true)
    String yourSelection;
    @Column(nullable = true)
    String mySelection;

    public Game(int id, LocalDateTime created, String winner, String yourSelection, String mySelection) {
        this.id = id;
        this.created = created;
        this.winner = winner;
        this.yourSelection = yourSelection;
        this.mySelection = mySelection;
    }

    public Game() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getYourSelection() {
        return yourSelection;
    }

    public void setYourSelection(String yourSelection) {
        this.yourSelection = yourSelection;
    }

    public String getMySelection() {
        return mySelection;
    }

    public void setMySelection(String mySelection) {
        this.mySelection = mySelection;
    }
}
