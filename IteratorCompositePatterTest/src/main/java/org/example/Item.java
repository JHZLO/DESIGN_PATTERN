package org.example;

public abstract class Item {
    public void add(Item item) {
        throw new UnsupportedOperationException();
    }

    public void remove(Item item) {
        throw new UnsupportedOperationException();
    }

    public Item getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
