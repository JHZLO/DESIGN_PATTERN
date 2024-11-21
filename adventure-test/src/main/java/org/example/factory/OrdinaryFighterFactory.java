package org.example.factory;

import org.example.Hero;
import org.example.weapon.Dagger;
import org.example.protective.LeatherMail;

public class OrdinaryFighterFactory implements HeroFactory {
    @Override
    public Hero createHero() {
        Hero hero = new Hero("fighter", "Ordinary Fighter");
        hero = new Dagger(hero);
        hero = new LeatherMail(hero);
        return hero;
    }
}
