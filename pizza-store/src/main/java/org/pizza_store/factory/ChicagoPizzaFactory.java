package org.pizza_store.factory;

import org.pizza_store.domain.ChicagoCheesePizza;
import org.pizza_store.domain.ChicagoClamPizza;
import org.pizza_store.domain.NyCheesePizza;
import org.pizza_store.domain.NyClamPizza;
import org.pizza_store.domain.Pizza;

public class ChicagoPizzaFactory extends PizzaFactory {
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
