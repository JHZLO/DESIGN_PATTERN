package org.duck_example.src.domain.strategies.fly;

public class FlyNoWay implements FlyBehavior {
    private static final String FLY_NO_WAY = "I cannot fly...";

    @Override
    public String fly(){
        return FLY_NO_WAY;
    }
}
