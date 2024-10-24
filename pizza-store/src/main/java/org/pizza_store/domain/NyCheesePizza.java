package org.pizza_store.domain;

public class NyCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing NyCheesePizza...");
    }
}
