package org.example;

public abstract class Character {
    public String name;
    public int attack = 10;
    public int defense = 5;
    public int health = 100;

    public Character(String name) {
        this.name = name;
    }

    public abstract void displayStats();
}
