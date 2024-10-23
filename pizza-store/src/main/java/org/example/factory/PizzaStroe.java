package org.example.factory;

import org.example.domain.CheesePizza;
import org.example.domain.ClamPizza;
import org.example.domain.Pizza;

public class PizzaStroe {
    public void orderPizza(String type){
        PizzaFactory factory = new PizzaFactory();
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
