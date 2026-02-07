package com.systemdesign.lld.PrototypePattern;

public class Circle extends  Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    // alternative copy constructor to implemnent clone method
    public Circle(Circle source) {
        this.radius = source.radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }   

    
}
