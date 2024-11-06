package org.pizzaFactory.pizza.clam;

import org.pizzaFactory.pizza.NYStylePizza;
import org.pizzaFactory.pizza.Pizza;

public class NYStyleClamPizza extends NYStylePizza {
    @Override
    public void prepare() {
        System.out.println("preparing NYStyleClamPizza...");
    }
}
