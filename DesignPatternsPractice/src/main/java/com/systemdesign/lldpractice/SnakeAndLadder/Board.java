package com.systemdesign.lldpractice.SnakeAndLadder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private final int size;
    Map<Integer, Integer> snakesAndLadders;

    public Board(int size, List<BoardEntity> entities) {
        this.size = size;
        this.snakesAndLadders = new HashMap<>();

        for(BoardEntity entity : entities){
            snakesAndLadders.put(entity.getStartPosition(), entity.getEndPosition());
        }
    }

    public int getSize() {
        return size;
    }

    public int getPosition(int currentPosition) {
        return snakesAndLadders.getOrDefault(currentPosition, currentPosition);
    }

}
