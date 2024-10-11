package org.weatherObserver.view;

public class TwoDisplay implements Display{
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void updateDisplay(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    private void display(){
        System.out.println("Two DISPLAY >> WeatherData : temperature: " + temperature + ", humidity: "+ humidity + ", pressure: "+ pressure);
    }
}
