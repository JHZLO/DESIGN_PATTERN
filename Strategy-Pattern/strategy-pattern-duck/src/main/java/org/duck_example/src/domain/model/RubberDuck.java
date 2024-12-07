package org.duck_example.src.domain.model;

import org.duck_example.src.domain.strategies.fly.FlyBehavior;
import org.duck_example.src.domain.strategies.fly.FlyNoWay;
import org.duck_example.src.domain.strategies.fly.FlyWithWings;
import org.duck_example.src.domain.strategies.quack.MuteQuack;
import org.duck_example.src.domain.strategies.quack.Quack;
import org.duck_example.src.domain.strategies.quack.QuackBehavior;
import org.duck_example.src.domain.strategies.quack.Squeak;
import org.duck_example.src.domain.strategies.swim.CanNotSwim;
import org.duck_example.src.domain.strategies.swim.CanSwim;
import org.duck_example.src.domain.strategies.swim.SwimBehavior;

public class RubberDuck extends Duck{
    private static final String RUBBER_DISPLAY = "I'm a real Rubber duck";

    public RubberDuck() {
        super(new Quack(), new FlyNoWay(), new CanNotSwim());
    }

    public String display() {
        return RUBBER_DISPLAY;
    }

}
