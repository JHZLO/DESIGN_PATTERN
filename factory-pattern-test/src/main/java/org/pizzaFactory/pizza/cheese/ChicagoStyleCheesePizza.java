package org.pizzaFactory.pizza.cheese;

import org.pizzaFactory.pizza.ChicagoStylePizza;
import org.pizzaFactory.pizza.Pizza;

public class ChicagoStyleCheesePizza extends ChicagoStylePizza {
    @Override
    public void prepare() {
        System.out.println("preparing ChicagoStyleCheesePizza...");
    }
}
