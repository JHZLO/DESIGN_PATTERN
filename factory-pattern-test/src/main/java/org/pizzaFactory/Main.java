package org.pizzaFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Pizza World");

        HeadStore headStore = new HeadStore();
        headStore.orderPizza("cheese");
        headStore.orderPizza("clam");
        headStore.orderPizza("pepperoni");

        NYStore nyStore = new NYStore();
        nyStore.orderPizza("cheese");
        nyStore.orderPizza("clam");
        nyStore.orderPizza("pepperoni");

        ChicagoStore chicagoStore = new ChicagoStore();
        chicagoStore.orderPizza("cheese");
        chicagoStore.orderPizza("clam");
        chicagoStore.orderPizza("pepperoni");
    }
}
