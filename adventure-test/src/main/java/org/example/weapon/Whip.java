package org.example.weapon;

import org.example.Hero;

public class Whip extends WeaponDecorator {
	private String weapon = "Whip";

	public Whip(Hero hero){
		super(hero);
	}

	@Override
	public String toString() {
		return super.toString() + "[weapon: " + weapon + "]";
	}
}
