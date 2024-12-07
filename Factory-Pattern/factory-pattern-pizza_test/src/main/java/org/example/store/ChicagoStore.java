package org.example.store;

import org.example.Pizza;
import org.example.factory.ChicagoPizzaFactory;
import org.example.factory.PizzaFactory;

public class ChicagoStore extends MyPizzaStore {
    PizzaFactory pizzaFactory = new ChicagoPizzaFactory();

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
