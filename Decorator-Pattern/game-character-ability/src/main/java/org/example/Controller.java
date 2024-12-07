package org.example;

import org.example.equipment.AccessoryDecorator;
import org.example.equipment.ArmorDecorator;
import org.example.equipment.WeaponDecorator;

public class Controller {
    public void run(){
        Character warrior = new BasicCharacter("Warrior");
        warrior.displayStats();
        System.out.println();

        // 장비 착용
        Character warriorWithSword = new WeaponDecorator(warrior, "Sword", 10);
        warriorWithSword.displayStats();
        System.out.println();

        Character warriorWithShield = new ArmorDecorator(warriorWithSword, "Shield", 8);
        warriorWithShield.displayStats();
        System.out.println();

        Character warriorWithAmulet = new AccessoryDecorator(warriorWithShield, "Amulet", 30);
        warriorWithAmulet.displayStats();
    }
}
