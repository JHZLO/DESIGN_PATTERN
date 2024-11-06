package org.pizzaFactory.pizza.pepperoni;

import org.pizzaFactory.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices ");
    }

    @Override
    public void prepare() {
        System.out.println("preparing ChicagoStylePepperoniPizza...");
    }
}
