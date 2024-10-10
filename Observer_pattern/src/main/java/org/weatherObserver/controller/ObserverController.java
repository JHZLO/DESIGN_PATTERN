package org.weatherObserver.controller;

import org.weatherObserver.model.WeatherData;

public class ObserverController {
    public void run(){
        WeatherData weatherData = new WeatherData();
        weatherData.setWeatherData(29.0F, 80.0F,21.0F);
    }
}
