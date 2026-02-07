package com.systemdesign.lld.PrototypePattern;

public class Square extends Shape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    // alternative copy constructor to implement clone method
    public Square(Square source) {
        this.sideLength = source.sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    @Override
    public Shape clone() {
        return new Square(this.sideLength);
    }
    
}
