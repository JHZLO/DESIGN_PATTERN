package org.example.protective;

import org.example.Hero;

public class Armor extends ProtectiveDecorator{
    private String protective = "Armor";

    public Armor(Hero hero){
        super(hero);
    }

    @Override
    public String toString() {
        return super.toString() + "[protective: " + protective + "]";
    }
}
