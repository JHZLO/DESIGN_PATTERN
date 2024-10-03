package org.duck_example.src.domain.strategies.swim;

public class CanSwim implements SwimBehavior {
    private static final String CAN_SWIM = "I can swim!";
    @Override
    public String swim(){
        return CAN_SWIM;
    }
}
