package org.pizzaFactory.pizza.cheese;

import org.pizzaFactory.pizza.NYStylePizza;
import org.pizzaFactory.pizza.Pizza;
import org.pizzaFactory.pizza.cheese.CheesePizza;

public class NYStyleCheesePizza extends NYStylePizza {
    @Override
    public void prepare() {
        System.out.println("preparing NYStyleCheesePizza...");
    }
}