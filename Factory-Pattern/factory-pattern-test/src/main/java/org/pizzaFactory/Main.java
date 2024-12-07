package org.pizzaFactory;

import org.pizzaFactory.store.ChicagoStore;
import org.pizzaFactory.store.HeadStore;
import org.pizzaFactory.store.MyPizzaStore;
import org.pizzaFactory.store.NYStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Pizza World");

        MyPizzaStore headStore = new HeadStore();
        headStore.orderPizza("cheese");
        headStore.orderPizza("clam");
        headStore.orderPizza("pepperoni");

        MyPizzaStore nyStore = new NYStore();
        nyStore.orderPizza("cheese");
        nyStore.orderPizza("clam");
        nyStore.orderPizza("pepperoni");

        MyPizzaStore chicagoStore = new ChicagoStore();
        chicagoStore.orderPizza("cheese");
        chicagoStore.orderPizza("clam");
        chicagoStore.orderPizza("pepperoni");
    }
}
