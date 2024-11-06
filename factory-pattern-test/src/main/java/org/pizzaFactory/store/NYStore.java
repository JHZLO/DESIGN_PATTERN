package org.pizzaFactory.store;

import org.pizzaFactory.factory.NYPizzaFactory;
import org.pizzaFactory.factory.PizzaFactory;
import org.pizzaFactory.pizza.Pizza;
import org.pizzaFactory.store.MyPizzaStore;

public class NYStore extends MyPizzaStore {
    PizzaFactory pizzaFactory = new NYPizzaFactory();

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
