package org.pizza_store.factory;

import org.pizza_store.domain.CheesePizza;
import org.pizza_store.domain.ClamPizza;
import org.pizza_store.domain.Pizza;

public class PizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        if (type.equals("Clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
