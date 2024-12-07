package org.pizzaFactory.pizza.pepperoni;

import org.pizzaFactory.pizza.ChicagoStylePizza;

public class ChicagoStylePepperoniPizza extends ChicagoStylePizza {
    @Override
    public void prepare() {
        System.out.println("preparing ChicagoStylePepperoniPizza...");
    }
}
