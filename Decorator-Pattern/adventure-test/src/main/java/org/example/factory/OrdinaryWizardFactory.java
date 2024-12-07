package org.example.factory;

import org.example.Hero;
import org.example.weapon.Whip;
import org.example.protective.Hood;

public class OrdinaryWizardFactory implements HeroFactory {
    @Override
    public Hero createHero() {
        Hero hero = new Hero("wizard", "Ordinary Wizard");
        hero = new Whip(hero);
        hero = new Hood(hero);
        return hero;
    }
}
