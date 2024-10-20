package org.duck_example.src.domain.model;

import org.duck_example.src.domain.strategies.fly.FlyBehavior;
import org.duck_example.src.domain.strategies.quack.QuackBehavior;
import org.duck_example.src.domain.strategies.swim.SwimBehavior;

public abstract class Duck {
    protected QuackBehavior quackBehavior = null;
    protected FlyBehavior flyBehavior = null;
    protected SwimBehavior swimBehavior = null;

    public Duck() {
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
