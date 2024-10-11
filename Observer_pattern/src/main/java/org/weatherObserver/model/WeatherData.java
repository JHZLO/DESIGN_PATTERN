package org.weatherObserver.model;

import java.util.ArrayList;
import org.weatherObserver.view.Display;
import org.weatherObserver.view.OneDisplay;
import org.weatherObserver.view.ThreeDisplay;
import org.weatherObserver.view.TwoDisplay;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    ArrayList<Display> displays = new ArrayList<Display>();

    public WeatherData(){
        addDisplay(new OneDisplay());
        addDisplay(new TwoDisplay());
        addDisplay(new ThreeDisplay());
    }

    private void measurementChange(){
        this.temperature = getTemperature();
        this.humidity = getHumidity();
        this.pressure = getPressure();

        for(Display myDisplay : displays){
            myDisplay.updateDisplay(this.temperature, this.humidity, this.pressure);
        }
    }

    private void addDisplay(Display display){
        displays.add(display);
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
