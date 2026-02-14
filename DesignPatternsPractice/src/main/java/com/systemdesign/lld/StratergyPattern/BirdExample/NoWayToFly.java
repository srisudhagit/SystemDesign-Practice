package com.systemdesign.lld.StratergyPattern.BirdExample;

public class NoWayToFly implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("No way to fly !!!");
    }
}
