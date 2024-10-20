package org.weatherObserver.controller;

import org.weatherObserver.model.WeatherData;
import org.weatherObserver.view.OneDisplay;
import org.weatherObserver.view.ThreeDisplay;
import org.weatherObserver.view.TwoDisplay;

public class ObserverController {
    public void run(){
        WeatherData weatherData = new WeatherData();

        weatherData.addDisplay(new OneDisplay(weatherData));
        weatherData.addDisplay(new TwoDisplay(weatherData));
        weatherData.addDisplay(new ThreeDisplay(weatherData));

        weatherData.setWeatherData(29.0F, 80.0F,21.0F);
    }
}
