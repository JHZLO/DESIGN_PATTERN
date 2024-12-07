package org.example.weapon;

import org.example.Hero;

public class WeaponDecorator extends Hero {
    Hero hero;

    public WeaponDecorator(Hero hero) {
        super(null, null);
        this.hero = hero;
    }

    @Override
    public String toString() {
        return hero.toString();
    }
}
