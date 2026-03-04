package com.systemdesign.lldpractice.SnakeAndLadder;

public class Dice {
    private final int maxValue;
    private final int minValue;

    public Dice(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public int roll() {
        return (int) (Math.random() * (maxValue - minValue + 1)) + minValue;
    }
    
}
