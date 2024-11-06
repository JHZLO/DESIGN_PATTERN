package org.pizzaFactory.pizza.cheese;

import org.pizzaFactory.pizza.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing CheesePizza...");
    }
}
