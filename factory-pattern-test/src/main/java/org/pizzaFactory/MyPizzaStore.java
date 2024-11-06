package org.pizzaFactory;

import org.pizzaFactory.factory.HeadStorePizzaFactory;
import org.pizzaFactory.factory.PizzaFactory;
import org.pizzaFactory.pizza.Pizza;
import org.pizzaFactory.pizza.cheese.CheesePizza;
import org.pizzaFactory.pizza.clam.ClamPizza;

public class MyPizzaStore {
    PizzaFactory pizzaFactory = new HeadStorePizzaFactory();

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

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
