package org.example.factory;

import org.example.NYStyleCheesePizza;
import org.example.NYStyleClamPizza;
import org.example.NYStylePepperoniPizza;
import org.example.Pizza;

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
