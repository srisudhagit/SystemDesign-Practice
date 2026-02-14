package com.systemdesign.lld.StratergyPattern.BirdExample;

public class Mute implements QuackBehavior{
    @Override
    public void quack(){
     System.out.println("I am silent....no quacking or squeaking");
    }
}
