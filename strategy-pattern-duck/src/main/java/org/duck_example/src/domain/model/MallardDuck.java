package org.duck_example.src.domain.model;

import org.duck_example.src.domain.strategies.fly.FlyWithWings;
import org.duck_example.src.domain.strategies.quack.Quack;
import org.duck_example.src.domain.strategies.swim.CanSwim;

public class MallardDuck extends Duck {
	private static final String MALLARD_DISPLAY = "I'm a real Mallard duck";

	// 객체를 생성하면서 behavior를 지정하라 -> 굳이 국한되지 않아도 됨
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		swimBehavior = new CanSwim();
	}
	
	public String display() {
		return MALLARD_DISPLAY;
	}
}
