package org.pizza_store;

import org.pizza_store.factory.NyPizzaFactory;
import org.pizza_store.factory.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Pizza World");

        PizzaFactory nyFactory = new NyPizzaFactory();
        nyFactory.orderPizza("cheese");

        PizzaFactory chicagoFactory = new NyPizzaFactory();
        chicagoFactory.orderPizza("cheese");
    }
}
