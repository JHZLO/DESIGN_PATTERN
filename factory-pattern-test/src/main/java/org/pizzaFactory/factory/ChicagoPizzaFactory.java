package org.pizzaFactory.factory;

import org.pizzaFactory.pizza.cheese.ChicagoStyleCheesePizza;
import org.pizzaFactory.pizza.clam.ChicagoStyleClamPizza;
import org.pizzaFactory.pizza.pepperoni.ChicagoStylePepperoniPizza;
import org.pizzaFactory.pizza.Pizza;

public class ChicagoPizzaFactory extends PizzaFactory{
    @Override
    public Pizza getClamPizza() {
        return new ChicagoStyleClamPizza();
    }

    @Override
    public Pizza getCheesePizza(){
        return new ChicagoStyleCheesePizza();
    }

    @Override
    public Pizza getPepperoniPizza() {
        return new ChicagoStylePepperoniPizza();
    }
}
