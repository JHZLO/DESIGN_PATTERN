package org.pizzaFactory.factory;

import org.pizzaFactory.pizza.cheese.CheesePizza;
import org.pizzaFactory.pizza.clam.ClamPizza;
import org.pizzaFactory.pizza.pepperoni.PepperoniPizza;
import org.pizzaFactory.pizza.Pizza;

public class HeadStorePizzaFactory extends PizzaFactory {
    @Override
    public Pizza getClamPizza() {
        return new ClamPizza();
    }

    @Override
    public Pizza getCheesePizza(){
        return new CheesePizza();
    }

    @Override
    public Pizza getPepperoniPizza() {
        return new PepperoniPizza();
    }
}
