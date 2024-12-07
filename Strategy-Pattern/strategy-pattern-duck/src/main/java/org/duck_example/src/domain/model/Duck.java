package org.duck_example.src.domain.model;

import org.duck_example.src.domain.strategies.fly.FlyBehavior;
import org.duck_example.src.domain.strategies.quack.QuackBehavior;
import org.duck_example.src.domain.strategies.swim.SwimBehavior;

public abstract class Duck {
    private final QuackBehavior quackBehavior;
    private final FlyBehavior flyBehavior;
    private final SwimBehavior swimBehavior;

    public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior, SwimBehavior swimBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
        this.swimBehavior = swimBehavior;
    }

    public abstract String display();

    public String fly() {
        return flyBehavior.fly();
    }

    public String quack() {
        return quackBehavior.quack();
    }

    public String swim() {
        return swimBehavior.swim();
    }
}
