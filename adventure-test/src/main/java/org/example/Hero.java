package org.example;

public class Hero {
    private String attribute = null;
    private String name = null;

    public Hero(String characteristic, String name) {
        this.attribute = characteristic;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero: " + name + " is a " + attribute +" ";
    }
}
