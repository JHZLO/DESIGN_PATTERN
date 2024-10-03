package org.duck_example.src.domain.model;

import org.duck_example.src.domain.strategies.fly.FlyNoWay;
import org.duck_example.src.domain.strategies.quack.MuteQuack;
import org.duck_example.src.domain.strategies.swim.CanNotSwim;

public class DecoyDuck extends Duck {
    private static final String DECOY_DISPLAY = "I'm a real Decoy duck";

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
        swimBehavior = new CanNotSwim();
    }

    public String display() {
        return DECOY_DISPLAY;
    }
}
