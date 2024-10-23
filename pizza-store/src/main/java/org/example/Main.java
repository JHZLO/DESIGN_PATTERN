package org.example;

import org.example.factory.PizzaStroe;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Pizza World");

        PizzaStroe store = new PizzaStroe();
        store.orderPizza("cheese");
    }
}
