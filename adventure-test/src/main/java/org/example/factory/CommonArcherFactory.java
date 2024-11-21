package org.example.factory;

import org.example.Hero;
import org.example.weapon.Bow;
import org.example.protective.Cloak;

public class CommonArcherFactory implements HeroFactory {
    @Override
    public Hero createHero() {
        Hero hero = new Hero("archer", "Common Archer");
        hero = new Bow(hero);
        hero = new Cloak(hero);
        return hero;
    }
}
