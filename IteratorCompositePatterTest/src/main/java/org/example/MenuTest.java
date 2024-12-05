package org.example;

public class MenuTest {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        System.out.println("USING FOR LOOPS");
        branchMenu(pancakeHouseMenu);
        dinerMenu(dinerMenu);
        printMenu(pancakeHouseMenu, dinerMenu); // 통합 메뉴 출력하기
    }

    private static void branchMenu(PancakeHouseMenu pancakeHouseMenu){
        for (int i = 0; i < pancakeHouseMenu.getMenuItems().size(); i++) {
            MenuItem menuItem = pancakeHouseMenu.getMenuItems().get(i);
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }

    private static void dinerMenu(DinerMenu dinerMenu){
        for (int i = 0; i < dinerMenu.getMenuItems().length; i++) {
            MenuItem menuItem = dinerMenu.getMenuItems()[i];
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }

    private static void printMenu(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu){
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
}
