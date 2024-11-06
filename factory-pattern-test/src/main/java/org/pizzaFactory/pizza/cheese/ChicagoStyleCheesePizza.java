package org.pizzaFactory.pizza.cheese;

import org.pizzaFactory.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices ");
    }

    @Override
    public void prepare() {
        System.out.println("preparing ChicagoStyleCheesePizza...");
    }
}
