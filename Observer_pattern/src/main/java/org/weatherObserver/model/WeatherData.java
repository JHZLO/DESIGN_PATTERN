package org.weatherObserver.model;

import org.weatherObserver.view.OneDisplay;
import org.weatherObserver.view.TwoDisplay;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;
    OneDisplay oneDisplay = new OneDisplay();
    TwoDisplay twoDisplay = new TwoDisplay();

    public void measurementChange(){
        this.temperature = getTemperature();
        this.humidity = getHumidity();
        this.pressure = getPressure();

        oneDisplay.display(this.temperature, this.humidity);
        twoDisplay.display(this.temperature, this.humidity, this.pressure);
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
