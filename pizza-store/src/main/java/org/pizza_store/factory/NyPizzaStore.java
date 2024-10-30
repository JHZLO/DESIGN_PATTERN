package org.pizza_store.factory;

import org.pizza_store.domain.NyCheesePizza;
import org.pizza_store.domain.NyClamPizza;
import org.pizza_store.domain.Pizza;

public class NyPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NyCheesePizza();
        }
        if (type.equals("Clam")) {
            pizza = new NyClamPizza();
        }
        return pizza;
    }
}
