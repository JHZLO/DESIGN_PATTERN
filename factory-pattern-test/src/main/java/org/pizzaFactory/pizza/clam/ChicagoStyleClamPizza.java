package org.pizzaFactory.pizza.clam;

import org.pizzaFactory.pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices ");
    }

    @Override
    public void prepare() {
        System.out.println("preparing ChicagoStyleClamPizza...");
    }
}
