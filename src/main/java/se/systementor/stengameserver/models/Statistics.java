package se.systementor.stengameserver.models;

public class Statistics {


    private long youWins;
    private long computerWins;
    private long ties;

    public Statistics(long youWins, long computerWins, long ties) {
        this.youWins = youWins;
        this.computerWins = computerWins;
        this.ties = ties;
    }

    public long getYouWins() {
        return youWins;
    }

    public void setYouWins(long youWins) {
        this.youWins = youWins;
    }

    public long getComputerWins() {
        return computerWins;
    }

    public void setComputerWins(long computerWins) {
        this.computerWins = computerWins;
    }

    public long getTies() {
        return ties;
    }

    public void setTies(long ties) {
        this.ties = ties;
    }
}
