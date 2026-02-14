package com.systemdesign.lld.ObserverPattern.FitnessTrackerExample;

public interface Subject {
    public void notifyObservers();
    public void subscribe(Observer ob);
    public void unsubscribe(Observer ob);
}
