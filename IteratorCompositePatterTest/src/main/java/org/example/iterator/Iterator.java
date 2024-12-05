package org.example.iterator;

import org.example.menu.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
    void initPosition();
}
