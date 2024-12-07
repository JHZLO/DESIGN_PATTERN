package org.pizzaFactory.pizza;

public abstract class ChicagoStylePizza extends Pizza{
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices ");
    }
}
