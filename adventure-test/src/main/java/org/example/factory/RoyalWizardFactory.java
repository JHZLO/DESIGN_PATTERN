package org.example.factory;

import org.example.Hero;
import org.example.weapon.Wand;
import org.example.protective.Cloak;

public class RoyalWizardFactory implements HeroFactory {
    @Override
    public Hero createHero() {
        Hero hero = new Hero("wizard", "Royal Wizard");
        hero = new Wand(hero);
        hero = new Cloak(hero);
        return hero;
    }
}
