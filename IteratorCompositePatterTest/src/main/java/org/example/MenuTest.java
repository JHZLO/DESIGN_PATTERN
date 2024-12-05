package org.example;

public class MenuTest {
    public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        System.out.println("USING FOR LOOPS");
        branchMenu(pancakeHouseMenu);
    }

    private static void branchMenu(PancakeHouseMenu pancakeHouseMenu){
        for (int i = 0; i < pancakeHouseMenu.getMenuItems().size(); i++) {
            MenuItem menuItem = pancakeHouseMenu.getMenuItems().get(i);
            System.out.print(menuItem.getName());
            System.out.println("\t\t" + menuItem.getPrice());
            System.out.println("\t" + menuItem.getDescription());
        }
    }
}
