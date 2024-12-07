package org.example.store;

import org.example.CheesePizza;
import org.example.ClamPizza;
import org.example.PepperoniPizza;
import org.example.Pizza;
import org.example.factory.ChicagoPizzaFactory;
import org.example.factory.HeadStorePizzaFactory;
import org.example.factory.PizzaFactory;

public class MyPizzaStore {
    PizzaFactory pizzaFactory = new ChicagoPizzaFactory();

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

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
