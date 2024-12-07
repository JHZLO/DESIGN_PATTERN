package org.example.coffee;

import org.example.Beverage;

public class Decaf extends Beverage {
    public Decaf(){
        description = "디카페인";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
