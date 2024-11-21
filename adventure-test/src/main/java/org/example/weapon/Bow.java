package org.example.weapon;

import org.example.Hero;

public class Bow extends WeaponDecorator{
	private String weapon = "Bow";

	public Bow(Hero hero){
		super(hero);
	}

	@Override
	public String toString() {
		return super.toString() + "[weapon: " + weapon + "]";
	}
}
