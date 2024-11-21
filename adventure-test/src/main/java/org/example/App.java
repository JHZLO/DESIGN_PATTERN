package org.example;

import org.example.factory.CommonArcherFactory;
import org.example.factory.HeroFactory;
import org.example.factory.OrdinaryFighterFactory;
import org.example.factory.OrdinaryWizardFactory;
import org.example.factory.PoorThiefFactory;
import org.example.factory.RoyalFighterFactory;
import org.example.factory.RoyalWizardFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Hero World!");

        HeroFactory heroFactory;

        heroFactory = new OrdinaryFighterFactory();
        Hero ordinaryFighter = heroFactory.createHero();
        System.out.println(ordinaryFighter);

        heroFactory = new RoyalFighterFactory();
        Hero royalFighter = heroFactory.createHero();
        System.out.println(royalFighter);

        heroFactory = new OrdinaryWizardFactory();
        Hero ordinaryWizard = heroFactory.createHero();
        System.out.println(ordinaryWizard);

        heroFactory = new RoyalWizardFactory();
        Hero royalWizard = heroFactory.createHero();
        System.out.println(royalWizard);

        heroFactory = new CommonArcherFactory();
        Hero commonArcher = heroFactory.createHero();
        System.out.println(commonArcher);

        heroFactory = new PoorThiefFactory();
        Hero poorThief = heroFactory.createHero();
        System.out.println(poorThief);
    }
}
