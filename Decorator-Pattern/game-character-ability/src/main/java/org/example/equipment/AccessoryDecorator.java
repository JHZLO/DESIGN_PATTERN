package org.example.equipment;

import org.example.Character;

public class AccessoryDecorator extends EquipmentDecorator {
    Character character;
    private String equipmentName;
    private int additionalHealth;

    public AccessoryDecorator(Character character, String equipmentName, int additionalHealth) {
        super(character);
        this.character = character;
        this.equipmentName = equipmentName;
        this.additionalHealth = additionalHealth;
    }

    @Override
    public void displayStats() {
        character.health += additionalHealth;
        character.displayStats();
        System.out.println("장비 추가: " + equipmentName + " (체력 +" + additionalHealth + ")");
    }
}
