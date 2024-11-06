package org.pizzaFactory.pizza.pepperoni;

import org.pizzaFactory.pizza.NYStylePizza;
import org.pizzaFactory.pizza.Pizza;

public class NYStylePepperoniPizza extends NYStylePizza {
    @Override
    public void prepare() {
        System.out.println("preparing NYStylePepperoniPizza...");
    }
}
