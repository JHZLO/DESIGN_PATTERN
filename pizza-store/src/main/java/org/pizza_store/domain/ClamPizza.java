package org.pizza_store.domain;

public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing ClamPizza...");
    }
}
