package org.example.protective;

import org.example.Hero;

public class Cloak extends ProtectiveDecorator{
	private String protective = "Cloak";

	public Cloak(Hero hero){
		super(hero);
	}

	@Override
	public String toString() {
		return super.toString() + "[protective: " + protective + "]";
	}
}
