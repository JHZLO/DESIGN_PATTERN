package org.example;

import java.util.Iterator;
import org.example.menu.DinerMenu;
import org.example.menu.Menu;
import org.example.menu.MenuItem;
import org.example.menu.PancakeHouseMenu;

public class MenuTest {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

        System.out.println("========== Branch Menu ==========");
        branchMenu(pancakeIterator);
        System.out.println();

        System.out.println("========== Diner Menu ==========");
        dinerMenu(dinerIterator);
        System.out.println();

        System.out.println("========== Total Menu ==========");
        pancakeIterator = pancakeHouseMenu.createIterator(); // Iterator 재생성
        dinerIterator = dinerMenu.createIterator();
        printMenu(pancakeIterator, dinerIterator);
        System.out.println();

        System.out.println("========== Vegetarian Menu ==========");
        pancakeIterator = pancakeHouseMenu.createIterator();
        dinerIterator = dinerMenu.createIterator();
        vegetarianMenu(pancakeIterator, dinerIterator);
    }

    private static void branchMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }

    private static void dinerMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }

    private static void printMenu(Iterator<MenuItem> pancakeIterator, Iterator<MenuItem> dinerIterator) {
        while (pancakeIterator.hasNext()) {
            MenuItem menuItem = pancakeIterator.next();
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
        while (dinerIterator.hasNext()) {
            MenuItem menuItem = dinerIterator.next();
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }

    private static void vegetarianMenu(Iterator<MenuItem> pancakeIterator, Iterator<MenuItem> dinerIterator){
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
