package org.pizza_store.domain;

public class NyClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing NyClamPizza...");
    }
}
