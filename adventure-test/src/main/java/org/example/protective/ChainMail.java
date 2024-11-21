package org.example.protective;

import org.example.Hero;

public class ChainMail extends ProtectiveDecorator {
    private String protective = "ChainMail";

    public ChainMail(Hero hero) {
        super(hero);
    }

    @Override
    public String toString() {
        return super.toString() + " with protective: " + protective;
    }
}
