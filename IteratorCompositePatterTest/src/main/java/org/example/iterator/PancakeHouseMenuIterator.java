package org.example.iterator;

import java.util.ArrayList;
import org.example.menu.MenuItem;

public class PancakeHouseMenuIterator implements Iterator{
    private final ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
        this.menuItems = menuItems;
    }
    @Override
    public boolean hasNext(){
        if(position >= menuItems.size() || menuItems.get(position) == null){
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next(){
        MenuItem menuItem = menuItems.get(position);
        position += 1;
        return menuItem;
    }
}
