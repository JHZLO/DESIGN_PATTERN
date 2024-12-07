package org.pizzaFactory.factory;

import org.pizzaFactory.pizza.cheese.NYStyleCheesePizza;
import org.pizzaFactory.pizza.clam.NYStyleClamPizza;
import org.pizzaFactory.pizza.pepperoni.NYStylePepperoniPizza;
import org.pizzaFactory.pizza.Pizza;

public class NYPizzaFactory extends PizzaFactory{
    @Override
    public Pizza getClamPizza() {
        return new NYStyleClamPizza();
    }

    @Override
    public Pizza getCheesePizza(){
        return new NYStyleCheesePizza();
    }

    @Override
    public Pizza getPepperoniPizza() {
        return new NYStylePepperoniPizza();
    }
}
