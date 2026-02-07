package com.systemdesign.lld.DecoratorPattern.CoffeeExample;

//This is a concrete decorator class that adds functionality to the beverage
// by extending the CondimentDecorator class
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
    
}
