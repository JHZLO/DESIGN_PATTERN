package org.duck_example.src.domain.model;

import org.duck_example.src.domain.strategies.fly.FlyBehavior;
import org.duck_example.src.domain.strategies.fly.FlyNoWay;
import org.duck_example.src.domain.strategies.fly.FlyWithWings;
import org.duck_example.src.domain.strategies.quack.Quack;
import org.duck_example.src.domain.strategies.quack.QuackBehavior;
import org.duck_example.src.domain.strategies.swim.CanSwim;
import org.duck_example.src.domain.strategies.swim.SwimBehavior;

public class RedHeadDuck extends Duck {
	private static final String RED_HEAD_DISPLAY = "I'm a real Red Headed duck";

	public RedHeadDuck() {
		super(new Quack(), new FlyWithWings(), new CanSwim());
	}

	public String display() {
		return RED_HEAD_DISPLAY;
	}
}
