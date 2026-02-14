package com.systemdesign.lld.StratergyPattern.BirdExample;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public void setFlyBehavior(FlyBehavior fb){
        System.out.println("Changing fly behavior");
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        System.out.println("Changing quack behavior");
        quackBehavior = qb;
    }
    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks swim, even toys !!!");
    }

    public abstract void display();
}
