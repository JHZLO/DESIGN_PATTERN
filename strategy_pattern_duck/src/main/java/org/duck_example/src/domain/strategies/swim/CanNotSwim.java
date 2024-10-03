package org.duck_example.src.domain.strategies.swim;

public class CanNotSwim implements SwimBehavior {
    private static final String CAN_NOT_SWIM = "I cannot swim...";

    @Override
    public String swim(){
        return CAN_NOT_SWIM;
    }
}
