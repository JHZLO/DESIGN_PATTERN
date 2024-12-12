package org.example;

import org.example.iterator.Iterator;
import org.example.menu.CompositeMenu;
import org.example.menu.DinerMenu;
import org.example.menu.Item;
import org.example.menu.Menu;
import org.example.menu.MenuItem;
import org.example.menu.PancakeHouseMenu;

public class MenuTest {
    public static void main(String[] args) {
        Item pancakeHouseMenu = new CompositeMenu("팬케이크 하우스 메뉴 ", "Branch CompositeMenu");
        Item dinerMenu = new CompositeMenu("diner 메뉴", "dinner CompositeMenu");
        Item vegetarianMenu = new CompositeMenu("vegetarian 메뉴", "vegetarian");
        Item totalMenu = new CompositeMenu("전체 메뉴", "전체 메뉴");

        totalMenu.add(pancakeHouseMenu);
        totalMenu.add(dinerMenu);

        Menu dinnerMenuItem = new DinerMenu();
        Menu pancakeHouseMenuItem = new PancakeHouseMenu();

        Iterator pancakeIterator = pancakeHouseMenuItem.createIterator();
        Iterator dinerIterator = dinnerMenuItem.createIterator();

        while (pancakeIterator.hasNext()) {
            MenuItem menuItem = pancakeIterator.next();
            if (menuItem.isVegetarian()) {
                vegetarianMenu.add(menuItem);
            }
            pancakeHouseMenu.add(menuItem);
        }

        while (dinerIterator.hasNext()) {
            MenuItem menuItem = dinerIterator.next();
            if (menuItem.isVegetarian()) {
                vegetarianMenu.add(menuItem);
            }
            dinerMenu.add(menuItem);
        }

        pancakeHouseMenu.print();
        dinerMenu.print();
        vegetarianMenu.print();
        totalMenu.print();
    }
}
