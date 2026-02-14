package com.systemdesign.lld.ObserverPattern.FitnessTrackerExample;

public class DisplayPannel implements Observer{

    @Override
    public void update(int a, int b, float c) {
       System.out.println("Fitness data in Display has been set to "+a+" "+b+" "+c);
    }
}
