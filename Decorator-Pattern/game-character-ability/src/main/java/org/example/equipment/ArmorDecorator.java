package org.example.equipment;

import org.example.Character;

public class ArmorDecorator extends EquipmentDecorator {
    Character character;
    private String equipmentName;
    private int additionalDefense;

    public ArmorDecorator(Character character, String equipmentName, int additionalDefense) {
        super(character);
        this.character = character;
        this.equipmentName = equipmentName;
        this.additionalDefense = additionalDefense;
    }

    @Override
    public void displayStats() {
        character.defense += additionalDefense;
        character.displayStats();
        System.out.println("장비 추가: " + equipmentName + " (방어력 +" + additionalDefense + ")");
    }
}
