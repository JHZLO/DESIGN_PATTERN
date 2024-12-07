package org.weatherObserver.model;

import java.util.ArrayList;
import org.weatherObserver.view.Display;
public class WeatherData extends DataSource {
    private float temperature;
    private float humidity;
    private float pressure;

    private void measurementChange(){
        myNotify();
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
