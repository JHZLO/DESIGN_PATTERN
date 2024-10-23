package org.pizza_store.factory;

import org.pizza_store.domain.Pizza;

public class PizzaStroe {
    public void orderPizza(String type) {
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
