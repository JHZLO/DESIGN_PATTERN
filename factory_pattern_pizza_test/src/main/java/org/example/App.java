package org.example;

import org.example.store.MyPizzaStore;
import org.example.store.NYStore;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Try This!");

        MyPizzaStore myPizzaStore = new NYStore();
        myPizzaStore.orderPizza("clam");
        myPizzaStore.orderPizza("cheese");
    }
}
