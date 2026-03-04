package com.systemdesign.lldpractice.SnakeAndLadder;

public class Snake extends BoardEntity {
    public Snake(int startPosition, int endPosition) {
        super(startPosition, endPosition);
        if (startPosition <= endPosition) {
            throw new IllegalArgumentException("Start position of snake should be greater than end position");
        }
    }
    
}
