package org.example.factory;

import org.example.Hero;
import org.example.protective.ProtectiveDecorator;
import org.example.weapon.WeaponDecorator;

public interface HeroFactory {
    Hero createHero();
}
