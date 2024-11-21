package org.example.weapon;

import org.example.Hero;

public class Wand extends WeaponDecorator{
	private String weapon = "Wand";

	public Wand(Hero hero){
        super(hero);
	}

	@Override
	public String toString() {
		return super.toString() + " with weapon: " + weapon;
	}
}
