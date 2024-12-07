package org.example.factory;

import org.example.Hero;
import org.example.weapon.Sword;
import org.example.protective.Armor;

public class RoyalFighterFactory implements HeroFactory {
    @Override
    public Hero createHero() {
        Hero hero = new Hero("fighter", "Royal Fighter");
        hero = new Sword(hero);
        hero = new Armor(hero);
        return hero;
    }
}
