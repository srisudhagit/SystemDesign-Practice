package com.systemdesign.lldpractice.SnakeAndLadder;

public abstract class BoardEntity {
    private final int startPosition;
    private final int endPosition;

    public BoardEntity(int startPosition, int endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public int getStartPosition() {
        return startPosition;
    }   

    public int getEndPosition() {
        return endPosition;
    }   
}
