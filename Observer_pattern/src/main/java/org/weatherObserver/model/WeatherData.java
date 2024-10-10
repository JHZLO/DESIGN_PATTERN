package org.weatherObserver.model;

import org.weatherObserver.view.OneDisplay;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;
    OneDisplay oneDisplay = new OneDisplay();

    public void measurementChange(){
        oneDisplay.display(getTemperature(), getHumidity());
    }
    public void setWeatherData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChange();
    }

    public float getTemperature(){
        return this.temperature;
    }

    public float getHumidity(){
        return this.humidity;
    }

    public float getPressure(){
        return this.pressure;
    }
}
