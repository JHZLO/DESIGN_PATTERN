package org.example.factory;

import org.example.ChicagoStyleCheesePizza;
import org.example.ChicagoStyleClamPizza;
import org.example.ChicagoStylePepperoniPizza;
import org.example.Pizza;

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
