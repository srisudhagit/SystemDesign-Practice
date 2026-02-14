package com.systemdesign.lld.ObserverPattern.WeatherExample;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    //observer is pulling the data from subject
    //Subject is not pushing the data to observer
    //so we are not passing any args to update method
    //we are using the getter methods of subject to get the data
    //this is called pull model
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity" + " and " + pressure + " pressure");
    }
    
}
