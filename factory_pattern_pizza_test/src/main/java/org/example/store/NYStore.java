package org.example.store;

import org.example.NYStyleCheesePizza;
import org.example.Pizza;
import org.example.factory.HeadStorePizzaFactory;
import org.example.factory.NYPizzaFactory;
import org.example.factory.PizzaFactory;

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
