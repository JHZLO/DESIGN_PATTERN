package org.example.condiment;

import org.example.Beverage;

public class Whip extends CondimentDecorator{
    final Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,휘핑";
    }
}
