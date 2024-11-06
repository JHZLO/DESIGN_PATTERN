package org.pizzaFactory.factory;

import org.pizzaFactory.pizza.ChicagoStyleClamPizza;
import org.pizzaFactory.pizza.NYStyleCheesePizza;
import org.pizzaFactory.pizza.NYStyleClamPizza;
import org.pizzaFactory.pizza.NYStylePepperoniPizza;
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
