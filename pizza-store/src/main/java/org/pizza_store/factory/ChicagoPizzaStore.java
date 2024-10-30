package org.pizza_store.factory;

import org.pizza_store.domain.ChicagoCheesePizza;
import org.pizza_store.domain.ChicagoClamPizza;
import org.pizza_store.domain.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        }
        if (type.equals("Clam")) {
            pizza = new ChicagoClamPizza();
        }
        return pizza;
    }
}
