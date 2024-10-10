package org.weatherObserver.model;

public class WeatherDate {
    private final float temperature;
    private final float humidity;
    private final float pressure;

    public setWeatherDate(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
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
