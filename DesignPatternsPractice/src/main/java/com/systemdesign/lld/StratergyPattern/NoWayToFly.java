package com.systemdesign.lld.StratergyPattern;

public class NoWayToFly implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("No way to fly !!!");
    }
}
