package com.systemdesign.lld.ObserverPattern.WeatherExample;

import java.util.*;

public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers;
    
    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o); 
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            //making update method has no args so that obeserver can pull only the required data
            observer.update();
        }
    }

    @Override
    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    public void measurementsChanged() {
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }

}
