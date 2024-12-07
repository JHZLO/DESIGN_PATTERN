package org.pizza_store;

import org.pizza_store.factory.NyPizzaStore;
import org.pizza_store.factory.PizzaStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Pizza World");

        PizzaStore nyFactory = new NyPizzaStore();
        nyFactory.orderPizza("cheese");

        PizzaStore chicagoFactory = new NyPizzaStore();
        chicagoFactory.orderPizza("cheese");
    }
}
