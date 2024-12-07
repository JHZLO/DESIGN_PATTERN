package org.example.equipment;

import org.example.Character;

public abstract class EquipmentDecorator extends Character {
    Character character;

    public EquipmentDecorator(Character character) {
        super(character.name);
        this.character = character;
    }

    @Override
    public abstract void displayStats();
}
