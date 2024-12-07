package org.pizzaFactory.store;

import org.pizzaFactory.factory.HeadStorePizzaFactory;
import org.pizzaFactory.factory.PizzaFactory;
import org.pizzaFactory.pizza.Pizza;

public class HeadStore extends MyPizzaStore {
    PizzaFactory pizzaFactory = new HeadStorePizzaFactory();

    @Override
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equalsIgnoreCase("cheese")) {
            pizza = pizzaFactory.getCheesePizza();
        }
        if (type.equalsIgnoreCase("Clam")) {
            pizza = pizzaFactory.getClamPizza();
        }
        if (type.equalsIgnoreCase("Pepperoni")){
            pizza = pizzaFactory.getPepperoniPizza();
        }
        return pizza;
    }
}
