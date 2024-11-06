package org.pizzaFactory.pizza.cheese;

import org.pizzaFactory.pizza.cheese.CheesePizza;

public class ChicagoStyleCheesePizza extends CheesePizza {
    @Override
    public void prepare() {
        System.out.println("preparing ChicagoStyleCheesePizza...");
    }
}
