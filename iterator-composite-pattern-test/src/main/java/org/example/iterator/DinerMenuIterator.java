package org.example.iterator;

import org.example.menu.Item;
import org.example.menu.MenuItem;

public class DinerMenuIterator extends Item implements Iterator {
    private final MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    @Override
    public void operation() {
        while (hasNext()) {
            MenuItem menuItem = next();
            menuItem.operation();
        }
    }
}
