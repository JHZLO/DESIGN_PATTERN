package org.duck_example.src.domain.strategies.quack;

public class Squeak implements QuackBehavior {
    private static final String SQUEAK = "Squeak!!";

    @Override
    public String quack(){
        return SQUEAK;
    }
}
