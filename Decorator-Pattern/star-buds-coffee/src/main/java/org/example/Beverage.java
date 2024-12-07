package org.example;

public abstract class Beverage {
    protected String description = null;

    public String getDescription(){
        return description;
    };
    public abstract double cost();
}
