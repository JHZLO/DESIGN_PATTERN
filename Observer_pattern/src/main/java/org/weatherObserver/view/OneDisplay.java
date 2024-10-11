package org.weatherObserver.view;

import org.weatherObserver.model.WeatherData;

public class OneDisplay implements Display{
    WeatherData weatherData;

    public OneDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    @Override
    public void updateDisplay(){
        display(weatherData.getTemperature(), weatherData.getHumidity());
    }

    private void display(float temperature, float humidity){
        System.out.println("One DISPLAY >> WeatherData : temperature: " + temperature + ", humidity: "+ humidity);
    }
}
