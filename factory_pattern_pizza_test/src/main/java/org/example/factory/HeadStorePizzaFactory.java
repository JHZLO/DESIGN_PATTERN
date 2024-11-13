package org.example.factory;

import org.example.CheesePizza;
import org.example.ClamPizza;
import org.example.PepperoniPizza;
import org.example.Pizza;

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
