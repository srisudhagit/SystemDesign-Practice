package com.systemdesign.lld.DecoratorPattern;

//HouseBlend is a type of beverage
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
    
}
