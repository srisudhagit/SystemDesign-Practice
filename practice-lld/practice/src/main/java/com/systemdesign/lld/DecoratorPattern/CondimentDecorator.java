package com.systemdesign.lld.DecoratorPattern;

// This ia Decorator which extends Bevarage class for type matching 
// and composes the beverage object for acquiring new behaviour
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
