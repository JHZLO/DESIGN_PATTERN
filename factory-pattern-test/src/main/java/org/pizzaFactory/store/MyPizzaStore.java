package org.pizzaFactory.store;

import org.pizzaFactory.factory.HeadStorePizzaFactory;
import org.pizzaFactory.factory.PizzaFactory;
import org.pizzaFactory.pizza.Pizza;
import org.pizzaFactory.pizza.cheese.CheesePizza;
import org.pizzaFactory.pizza.clam.ClamPizza;

public class MyPizzaStore {
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
