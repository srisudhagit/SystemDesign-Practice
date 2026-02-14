package com.systemdesign.lld.StratergyPattern.BirdExample;

public class Client {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.display();
        duck1.performFly();
        duck1.performQuack();

        duck1.setFlyBehavior(new FlyRocketedBehavior());
        duck1.setQuackBehavior(new Quack());
        duck1.performFly();
        duck1.performQuack();
    }
    
}
