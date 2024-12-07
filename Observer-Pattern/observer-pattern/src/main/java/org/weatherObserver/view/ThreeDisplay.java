package org.weatherObserver.view;

import org.weatherObserver.model.WeatherData;

public class ThreeDisplay implements Display{
    WeatherData weatherData;

    public ThreeDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    @Override
    public void updateDisplay(){
        display(weatherData.getTemperature());
    }

    private void display(float temperature){
        System.out.println("Three DISPLAY >> WeatherData : temperature: " + temperature);
    }
}
