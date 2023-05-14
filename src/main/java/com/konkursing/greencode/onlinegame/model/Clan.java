package com.konkursing.greencode.onlinegame.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Clan {
    private int numberOfPlayers;
    private int points;
    
    @JsonIgnore
    public Double getAveragePoints(){
        return (double) (points / numberOfPlayers);
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}
