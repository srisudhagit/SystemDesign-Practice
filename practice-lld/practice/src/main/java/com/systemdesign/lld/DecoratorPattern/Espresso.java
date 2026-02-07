package com.systemdesign.lld.DecoratorPattern;

// Espresso is a type of beverage
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
