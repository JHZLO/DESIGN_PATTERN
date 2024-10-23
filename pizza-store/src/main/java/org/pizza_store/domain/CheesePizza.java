package org.pizza_store.domain;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing CheesePizza...");
    }
}
