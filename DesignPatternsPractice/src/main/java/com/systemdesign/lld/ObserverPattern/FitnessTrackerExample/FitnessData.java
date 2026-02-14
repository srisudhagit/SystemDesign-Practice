package com.systemdesign.lld.ObserverPattern.FitnessTrackerExample;

import java.util.ArrayList;
import java.util.List;

public class FitnessData implements Subject{
    List<Observer> observers = new ArrayList<>();
    private int steps;
    private int activeMinutes;
    private float calories;

    public FitnessData(){
        
    }

    @Override
    public void notifyObservers() {
        for(Observer ob : observers){
            ob.update(this.activeMinutes, this.steps, this.calories);
        }
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        for(Observer ob : observers){
            if(observer == ob){
                observers.remove(ob);
            }
        }
    }
    
    // any kind of updates made on subject will be 
    public void setFitnessData(int steps, int activeMinutes, float calories){
        this.activeMinutes = activeMinutes;
        this.steps = steps;
        this.calories = calories;
        this.notifyObservers();
    }
}