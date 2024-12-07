package org.example.coffee;

import org.example.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "다크로스트";
    }

    @Override
    public double cost() {
        return 1.88;
    }
}
