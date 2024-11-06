package org.pizzaFactory.pizza.pepperoni;

import org.pizzaFactory.pizza.Pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing PepperoniPizza...");
    }
}
