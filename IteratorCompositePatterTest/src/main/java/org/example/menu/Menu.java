package org.example.menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
