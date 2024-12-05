package org.example;

public class MenuTest {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        System.out.println("USING FOR LOOPS");
        for (int i = 0; i < pancakeHouseMenu.getMenuItems().size(); i++) {
            MenuItem menuItem = pancakeHouseMenu.getMenuItems().get(i);
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }

        for (int i = 0; i < dinnerMenu.getMenuItems().length; i++) {
            MenuItem menuItem = dinnerMenu.getMenuItems()[i];
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }

    }
}
