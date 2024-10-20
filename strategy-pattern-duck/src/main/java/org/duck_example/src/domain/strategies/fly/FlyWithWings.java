package org.duck_example.src.domain.strategies.fly;

public class FlyWithWings implements FlyBehavior{
    private static final String FLY_WITH_WINGS = "I can fly!";

    @Override
    public String fly() {
        return FLY_WITH_WINGS;
    }
}
