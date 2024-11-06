package org.pizzaFactory.store;

import org.pizzaFactory.factory.ChicagoPizzaFactory;
import org.pizzaFactory.factory.PizzaFactory;
import org.pizzaFactory.pizza.Pizza;

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
