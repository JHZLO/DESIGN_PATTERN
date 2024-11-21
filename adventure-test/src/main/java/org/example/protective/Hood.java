package org.example.protective;

import org.example.Hero;

public class Hood extends ProtectiveDecorator{
    private String protective = "Hood";

    public Hood(Hero hero){
        super(hero);
    }

    @Override
    public String toString() {
        return super.toString() + " with protective: " + protective;
    }
}
