package org.duck_example.src.domain.strategies.quack;

public class MuteQuack implements QuackBehavior {
    private static final String MUTE_QUACK = "mute...";

    @Override
    public String quack() {
        return MUTE_QUACK;
    }
}
