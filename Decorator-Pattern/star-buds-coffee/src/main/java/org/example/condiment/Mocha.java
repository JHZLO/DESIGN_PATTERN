package org.example.condiment;

import org.example.Beverage;

public class Mocha extends CondimentDecorator {
    final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,모카";
    }
}
