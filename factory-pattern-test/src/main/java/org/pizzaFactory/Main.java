package org.pizzaFactory;

import org.pizzaFactory.factory.ChicagoPizzaFactory;
import org.pizzaFactory.factory.PizzaFactory;
import org.pizzaFactory.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Pizza World");

        MyPizzaStore myPizzaStore = new MyPizzaStore();
        myPizzaStore.orderPizza("cheese");
        myPizzaStore.orderPizza("clam");
        myPizzaStore.orderPizza("pepperoni");

        PizzaFactory pizzaFactory = new ChicagoPizzaFactory();
        Pizza pizza = pizzaFactory.getCheesePizza();
        pizza.cut();
    }
}
