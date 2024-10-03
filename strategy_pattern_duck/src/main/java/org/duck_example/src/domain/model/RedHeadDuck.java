package org.duck_example.src.domain.model;

import org.duck_example.src.domain.strategies.fly.FlyWithWings;
import org.duck_example.src.domain.strategies.quack.Quack;
import org.duck_example.src.domain.strategies.swim.CanSwim;

public class RedHeadDuck extends Duck {
	private static final String RED_HEAD_DISPLAY = "I'm a real Red Headed duck";

	public RedHeadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		swimBehavior = new CanSwim();
	}

	public String display() {
		return RED_HEAD_DISPLAY;
	}
}
