package org.example.iterator;

import java.util.ArrayList;
import org.example.menu.MenuItem;

public class PancakeHouseMenuIterator implements Iterator {
    private final ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }

    @Override
    public void initPosition(){
        this.position = 0;
    }
}
