package org.example.protective;

import org.example.Hero;

public class LeatherMail extends ProtectiveDecorator {
	private String protective = "LeatherMail";

	public LeatherMail(Hero hero){
		super(hero);
	}

	@Override
	public String toString() {
		return super.toString() + "[protective: " + protective + "]";
	}
}
