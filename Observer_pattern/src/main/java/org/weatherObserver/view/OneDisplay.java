package org.weatherObserver.view;

public class OneDisplay implements Display{
    private float temperature;
    private float humidity;
    private float preesure;

    @Override
    public void updateDisplay(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.preesure = pressure;
    }

    @Override
    public void display(){
        System.out.println("WeatherData : temperature: " + this.temperature + ", humidity: "+ this.humidity);
    }

//    public float getTemperature(){
//        return this.temperature;
//    }
//
//    public float getHumidity(){
//        return this.humidity;
//    }
//
//    public float getPreesure(){
//        return this.preesure;
//    }
}
