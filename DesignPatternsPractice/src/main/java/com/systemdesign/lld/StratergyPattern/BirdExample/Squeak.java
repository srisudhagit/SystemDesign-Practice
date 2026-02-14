package com.systemdesign.lld.StratergyPattern.BirdExample;

public class Squeak implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("I am squeaking");
    }
}
