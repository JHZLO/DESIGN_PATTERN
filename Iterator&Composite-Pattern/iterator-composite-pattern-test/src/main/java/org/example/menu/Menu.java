package org.example.menu;

import java.util.ArrayList;

public class Menu extends Item {
    private final ArrayList<Item> items = new ArrayList<>();
    private final String name;

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public void remove(Item item) {
        items.remove(item);
    }

    @Override
    public Item getChild(int i) {
        return items.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println("---------------------");
    }

    @Override
    public void operation() {
        System.out.println("========== " + getName() + " ==========");
        for (Item item : items) {
            item.operation();
        }
    }
}
