package com.systemdesign.lld.StratergyPattern.BirdExample;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new NoWayToFly();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
    
}
