package org.example;

import org.example.protective.Armor;
import org.example.weapon.Wand;
import org.example.weapon.WeaponDecorator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Hero World!");

        Hero hero = new Hero("fighter", "Conan");

        hero =  new Wand(hero);
        hero =  new Armor(hero);

        System.out.println(hero);
    }
}
