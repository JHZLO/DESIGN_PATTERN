package org.example.factory;

import org.example.domain.CheesePizza;
import org.example.domain.ClamPizza;
import org.example.domain.Pizza;

public class PizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }
        if(type.equals("Clam")){
            pizza = new ClamPizza();

        }
        return pizza;
    }
}
