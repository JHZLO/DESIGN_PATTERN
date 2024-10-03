package org.duck_example.src.domain.model;

import org.duck_example.src.domain.strategies.fly.FlyNoWay;
import org.duck_example.src.domain.strategies.quack.MuteQuack;
import org.duck_example.src.domain.strategies.quack.Squeak;
import org.duck_example.src.domain.strategies.swim.CanNotSwim;

public class RubberDuck extends Duck{
    private static final String RUBBER_DISPLAY = "I'm a real Rubber duck";

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
        swimBehavior = new CanNotSwim();
    }

    public String display() {
        return RUBBER_DISPLAY;
    }

}
