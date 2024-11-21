package org.example.weapon;

import org.example.Hero;

public class Dagger extends WeaponDecorator {
	private String weapon = "Dagger";

	public Dagger(Hero hero){
		super(hero);
	}

	@Override
	public String toString() {
		return super.toString() + "[weapon: " + weapon + "]";
	}
}
