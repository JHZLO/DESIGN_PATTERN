package org.pizzaFactory.pizza.clam;

import org.pizzaFactory.pizza.Pizza;

public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing ClamPizza...");
    }
}
