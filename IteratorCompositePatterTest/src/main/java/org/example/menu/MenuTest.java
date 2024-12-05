package org.example.menu;

import org.example.PancakeHouseMenu;
import org.example.menu.DinerMenu;
import org.example.menu.MenuItem;

public class MenuTest {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        System.out.println("==========branchMenu==========");
        branchMenu(pancakeHouseMenu);
        System.out.println();

        System.out.println("==========dinerMenu==========");
        dinerMenu(dinerMenu);
        System.out.println();

        System.out.println("==========totalMenu==========");
        printMenu(pancakeHouseMenu, dinerMenu); // 통합 메뉴 출력하기
        System.out.println();

        System.out.println("==========vegeterianMenu==========");
        vegeterianMenu(pancakeHouseMenu, dinerMenu);
    }

    private static void branchMenu(PancakeHouseMenu pancakeHouseMenu) {
        for (int i = 0; i < pancakeHouseMenu.getMenuItems().size(); i++) {
            MenuItem menuItem = pancakeHouseMenu.getMenuItems().get(i);
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }

    private static void dinerMenu(DinerMenu dinerMenu) {
        for (int i = 0; i < dinerMenu.getMenuItems().length; i++) {
            MenuItem menuItem = dinerMenu.getMenuItems()[i];
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }

    private static void printMenu(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        for (int i = 0; i < pancakeHouseMenu.getMenuItems().size(); i++) {
            MenuItem menuItem = pancakeHouseMenu.getMenuItems().get(i);
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
        for (int i = 0; i < dinerMenu.getMenuItems().length; i++) {
            MenuItem menuItem = dinerMenu.getMenuItems()[i];
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }

    private static void vegeterianMenu(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        for (int i = 0; i < pancakeHouseMenu.getMenuItems().size(); i++) {
            MenuItem menuItem = pancakeHouseMenu.getMenuItems().get(i);
            if (menuItem.isVegetarian()) {
                System.out.print(menuItem.getName());
                System.out.println("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
            }
        }
        for (int i = 0; i < dinerMenu.getMenuItems().length; i++) {
            MenuItem menuItem = dinerMenu.getMenuItems()[i];
            if (menuItem.isVegetarian()) {
                System.out.print(menuItem.getName());
                System.out.println("\t\t" + menuItem.getPrice());
                System.out.println("\t" + menuItem.getDescription());
            }
        }
    }
}
