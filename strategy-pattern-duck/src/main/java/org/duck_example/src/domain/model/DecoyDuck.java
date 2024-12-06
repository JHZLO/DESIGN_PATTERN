package org.duck_example.src.domain.model;

import org.duck_example.src.domain.strategies.fly.FlyBehavior;
import org.duck_example.src.domain.strategies.fly.FlyNoWay;
import org.duck_example.src.domain.strategies.quack.MuteQuack;
import org.duck_example.src.domain.strategies.quack.QuackBehavior;
import org.duck_example.src.domain.strategies.swim.CanNotSwim;
import org.duck_example.src.domain.strategies.swim.SwimBehavior;

public class DecoyDuck extends Duck {
    private static final String DECOY_DISPLAY = "I'm a real Decoy duck";

    public DecoyDuck() {
        super(new MuteQuack(), new FlyNoWay(), new CanNotSwim());
    }

    public String display() {
        return DECOY_DISPLAY;
    }
}
