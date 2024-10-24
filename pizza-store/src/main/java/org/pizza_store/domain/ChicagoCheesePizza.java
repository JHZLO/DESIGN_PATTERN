package org.pizza_store.domain;

public class ChicagoCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing ChicagoCheesePizza...");
    }
}
