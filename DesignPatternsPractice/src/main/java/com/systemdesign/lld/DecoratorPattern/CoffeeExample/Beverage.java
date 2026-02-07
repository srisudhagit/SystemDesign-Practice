package com.systemdesign.lld.DecoratorPattern.CoffeeExample;

// super class of all beverages
public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI }
    Size size = Size.TALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    
}
