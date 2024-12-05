package org.example;

import org.example.iterator.Iterator;
import org.example.iterator.PancakeHouseMenuIterator;
import org.example.menu.DinerMenu;
import org.example.menu.MenuItem;
import org.example.menu.PancakeHouseMenu;

public class MenuTest {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("==========branchMenu==========");
        branchMenu(pancakeIterator);
        System.out.println();

        System.out.println("==========dinerMenu==========");
        dinerMenu(dinerIterator);
        System.out.println();

        System.out.println("==========totalMenu==========");
        pancakeIterator.initPosition();
        dinerIterator.initPosition();
        printMenu(pancakeHouseMenu, dinerIterator); // 통합 메뉴 출력하기
        System.out.println();

        System.out.println("==========vegeterianMenu==========");
        pancakeIterator.initPosition();
        dinerIterator.initPosition();
        vegeterianMenu(pancakeHouseMenu, dinerIterator);
    }

    private static void branchMenu(Iterator pancakeIterator) {
        while(pancakeIterator.hasNext()) {
            MenuItem menuItem = pancakeIterator.next();
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }

    private static void dinerMenu(Iterator dinerIterator) {
        while(dinerIterator.hasNext()){
            MenuItem menuItem = dinerIterator.next();
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }

    private static void printMenu(PancakeHouseMenu pancakeHouseMenu, Iterator dinerIterator) {
        for (MenuItem menuItem : pancakeHouseMenu.getMenuItems()) {
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
        while(dinerIterator.hasNext()){
            MenuItem menuItem = dinerIterator.next();
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }


    private static void vegeterianMenu(PancakeHouseMenu pancakeHouseMenu, Iterator dinerIterator) {
        for (MenuItem menuItem : pancakeHouseMenu.getMenuItems()) {
            if (menuItem.isVegetarian()) {
                System.out.print(menuItem.getName());
                System.out.println("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
            }
        }
        while(dinerIterator.hasNext()) {
            MenuItem menuItem = dinerIterator.next();
            if (menuItem.isVegetarian()) {
                System.out.print(menuItem.getName());
                System.out.println("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
            }
        }
    }
}
