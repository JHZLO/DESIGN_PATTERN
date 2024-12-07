package org.example.iterator;

import org.example.menu.MenuItem;

public interface Iterator {
    public boolean hasNext();
    public MenuItem next();
    public void operation();
}
