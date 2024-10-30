package org.pizza_store.factory;

import org.pizza_store.domain.Pizza;

public class PizzaStore {
    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
    public Pizza createPizza(String type) {
        return null;
    }
}
