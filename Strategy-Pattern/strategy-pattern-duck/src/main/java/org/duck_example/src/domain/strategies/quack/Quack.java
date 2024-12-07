package org.duck_example.src.domain.strategies.quack;

public class Quack implements QuackBehavior {
    private static final String QUACK = "Quack!!";

    @Override
    public String quack(){
        return QUACK;
    }
}
