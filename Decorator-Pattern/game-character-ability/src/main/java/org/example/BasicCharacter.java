package org.example;

class BasicCharacter extends Character {
    public BasicCharacter(String name) {
        super(name);
    }

    @Override
    public void displayStats() {
        System.out.println("캐릭터: " + name);
        System.out.println("능력치: 공격력 " + attack + ", 방어력 " + defense + ", 체력 " + health);
    }
}
