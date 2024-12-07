package org.example.equipment;

import org.example.Character;

public class WeaponDecorator extends EquipmentDecorator {
    Character character;
    private String equipmentName;
    private int additionalAttack;

    public WeaponDecorator(final Character character, String equipmentName, int additionalAttack) {
        super(character);
        this.character = character;
        this.equipmentName = equipmentName;
        this.additionalAttack = additionalAttack;
    }

    @Override
    public void displayStats() {
        character.attack += additionalAttack;
        character.displayStats();
        System.out.println("장비 추가: " + equipmentName + " (공격력 +" + additionalAttack + ")");
    }
}
