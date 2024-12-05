package org.example;

import org.example.iterator.Iterator;
import org.example.iterator.PancakeHouseMenuIterator;
import org.example.menu.DinerMenu;
import org.example.menu.Item;
import org.example.menu.Menu;
import org.example.menu.MenuItem;
import org.example.menu.PancakeHouseMenu;

public class MenuTest {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();


        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("========== Branch Menu ==========");
        branchMenu(pancakeIterator);
        System.out.println();

        System.out.println("========== Diner Menu ==========");
        dinerMenu(dinerIterator);
        System.out.println();

        System.out.println("========== Total Menu ==========");
        pancakeIterator = pancakeHouseMenu.createIterator();
        dinerIterator = dinerMenu.createIterator();
        printMenu(pancakeIterator, dinerIterator);
        System.out.println();

        System.out.println("========== Vegetarian Menu ==========");
        pancakeIterator = pancakeHouseMenu.createIterator();
        dinerIterator = dinerMenu.createIterator();
        vegetarianMenu(pancakeIterator, dinerIterator);
    }

    private static void branchMenu(Iterator pancakeIterator) {
        pancakeIterator.operation();
    }

    private static void dinerMenu(Iterator dinerIterator) {
        dinerIterator.operation();
    }

    private static void printMenu(Iterator pancakeIterator, Iterator dinerIterator) {
        pancakeIterator.operation();
        dinerIterator.operation();
    }

    private static void vegetarianMenu(Iterator pancakeIterator, Iterator dinerIterator){
        while (pancakeIterator.hasNext()) {
            MenuItem menuItem = pancakeIterator.next();
            if(menuItem.isVegetarian()){
                System.out.print(menuItem.getName());
                System.out.println("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
            }
        }
        while (dinerIterator.hasNext()) {
            MenuItem menuItem = dinerIterator.next();
            if(menuItem.isVegetarian()){
                System.out.print(menuItem.getName());
                System.out.println("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
            }
        }
    }
}
