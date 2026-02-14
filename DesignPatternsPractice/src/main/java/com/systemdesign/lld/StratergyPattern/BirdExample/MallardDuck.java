package com.systemdesign.lld.StratergyPattern.BirdExample;

public class MallardDuck extends Duck{
    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Mute();
    }

    @Override
    public void display(){
        System.out.println("I am a mallard duck");
    }
}
