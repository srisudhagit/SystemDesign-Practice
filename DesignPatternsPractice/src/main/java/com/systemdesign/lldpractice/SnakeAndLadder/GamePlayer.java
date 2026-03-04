package com.systemdesign.lldpractice.SnakeAndLadder;

public class GamePlayer {
    private String name;
    private int currentPosition;

    public GamePlayer(String name) {
        this.name = name;
        this.currentPosition = 0;
    }

    public String getName() {
        return name;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
