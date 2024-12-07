package org.example.factory;

import org.example.Hero;
import org.example.weapon.Dagger;
import org.example.protective.Hood;

public class PoorThiefFactory implements HeroFactory {
    @Override
    public Hero createHero() {
        Hero hero = new Hero("thief", "Poor Thief");
        hero = new Dagger(hero);
        hero = new Hood(hero);
        return hero;
    }
}
