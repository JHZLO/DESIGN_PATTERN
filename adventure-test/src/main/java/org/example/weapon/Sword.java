package org.example.weapon;

import org.example.Hero;

public class Sword extends WeaponDecorator {
	private String weapon = "Sword";

	public Sword(Hero hero){
		super(hero);
	}

	@Override
	public String toString() {
		return super.toString() + " with weapon: " + weapon;
	}
}
