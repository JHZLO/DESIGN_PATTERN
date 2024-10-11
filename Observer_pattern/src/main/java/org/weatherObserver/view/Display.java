package org.weatherObserver.view;

public interface Display {
    public void updateDisplay(float temperature, float humidity, float pressure);
    public void display();
}
