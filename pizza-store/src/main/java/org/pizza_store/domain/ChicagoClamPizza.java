package org.pizza_store.domain;

public class ChicagoClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("preparing ChicagoClamPizza...");
    }
}
