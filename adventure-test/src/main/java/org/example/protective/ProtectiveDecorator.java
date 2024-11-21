package org.example.protective;

import org.example.Hero;

public class ProtectiveDecorator extends Hero {
    Hero hero;

    public ProtectiveDecorator(Hero hero) {
        super(null, null);
        this.hero = hero;
    }

    @Override
    public String toString() {
        return hero.toString();
    }
}
