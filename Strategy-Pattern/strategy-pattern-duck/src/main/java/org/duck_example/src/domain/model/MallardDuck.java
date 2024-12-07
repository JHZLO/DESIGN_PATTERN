package org.duck_example.src.domain.model;

import org.duck_example.src.domain.strategies.fly.FlyBehavior;
import org.duck_example.src.domain.strategies.fly.FlyWithWings;
import org.duck_example.src.domain.strategies.quack.Quack;
import org.duck_example.src.domain.strategies.quack.QuackBehavior;
import org.duck_example.src.domain.strategies.quack.Squeak;
import org.duck_example.src.domain.strategies.swim.CanSwim;
import org.duck_example.src.domain.strategies.swim.SwimBehavior;

public class MallardDuck extends Duck {
	private static final String MALLARD_DISPLAY = "I'm a real Mallard duck";

	// 객체를 생성하면서 behavior를 지정하라 -> 굳이 국한되지 않아도 됨
	public MallardDuck() {
		super(new Squeak(), new FlyWithWings(), new CanSwim());
	}
	
	public String display() {
		return MALLARD_DISPLAY;
	}
}
