package org.example;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Item {
    private List<Item> items = new ArrayList<Item>();
    private final String name;
    private final String description;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void add(Item item){
        items.add(item);
    }

    public void remove(Item item){
        items.remove(item);
    }

    public Item getChild(int i){
        return items.get(i);
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void print(){
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-----------------------");
    }
}
