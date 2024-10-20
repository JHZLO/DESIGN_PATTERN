package org.weatherObserver.view;

import org.weatherObserver.model.WeatherData;

public class TwoDisplay implements Display{
    WeatherData weatherData;

    public TwoDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
    }

    @Override
    public void updateDisplay(){
        display(weatherData.getTemperature(), weatherData.getHumidity(), weatherData.getPressure());
    }

    private void display(float temperature, float humidity, float pressure){
        System.out.println("Two DISPLAY >> WeatherData : temperature: " + temperature + ", humidity: "+ humidity + ", pressure: "+ pressure);
    }
}
