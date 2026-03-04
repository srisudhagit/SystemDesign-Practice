package com.systemdesign.lldpractice.SnakeAndLadder;

public class Ladder extends BoardEntity {
    public Ladder(int startPosition, int endPosition) {
        super(startPosition, endPosition);
        if (startPosition >= endPosition) {
            throw new IllegalArgumentException("Start position of ladder should be less than end position");
        }
    }   
    
}
