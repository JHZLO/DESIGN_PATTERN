package org.pizzaFactory.pizza.clam;

import org.pizzaFactory.pizza.ChicagoStylePizza;

public class ChicagoStyleClamPizza extends ChicagoStylePizza {
    @Override
    public void prepare() {
        System.out.println("preparing ChicagoStyleClamPizza...");
    }
}
