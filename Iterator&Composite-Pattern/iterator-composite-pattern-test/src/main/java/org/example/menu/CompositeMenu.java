package org.example.menu;

import java.util.ArrayList;

public class CompositeMenu extends Item {
    private final ArrayList<Item> items = new ArrayList<>();
    private final String name;
    private final String description;

    public CompositeMenu(String name, String description) {
        this.name = name;
        this.description = description;
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
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("========== " + getName() + " ==========");
        for (Item item : items) {
            item.operation();
        }
    }
}
