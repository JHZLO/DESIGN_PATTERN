package org.example.coffee;

import org.example.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
