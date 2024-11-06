package org.pizzaFactory.factory;

import org.pizzaFactory.pizza.ChicagoStyleCheesePizza;
import org.pizzaFactory.pizza.ChicagoStyleClamPizza;
import org.pizzaFactory.pizza.ChicagoStylePepperoniPizza;
import org.pizzaFactory.pizza.Pizza;

public class ChicagoPizzaFactory extends PizzaFactory{
    public Pizza getClamPizza() {
        return new ChicagoStyleClamPizza();
    }

    public Pizza getCheesePizza(){
        return new ChicagoStyleCheesePizza();
    }

    public Pizza getPepperoniPizza() {
        return new ChicagoStylePepperoniPizza();
    }
}
