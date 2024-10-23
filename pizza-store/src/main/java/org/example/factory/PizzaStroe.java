package org.example.factory;

import org.example.domain.CheesePizza;
import org.example.domain.ClamPizza;
import org.example.domain.Pizza;

public class PizzaStroe {
    public Pizza orderPizza(String type){
        Pizza pizza = new Pizza();

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("Clam")){
            pizza = new ClamPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
