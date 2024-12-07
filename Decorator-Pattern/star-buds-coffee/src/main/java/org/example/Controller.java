package org.example;

import org.example.coffee.DarkRoast;
import org.example.coffee.Espresso;
import org.example.condiment.Milk;
import org.example.condiment.Mocha;
import org.example.condiment.Whip;

public class Controller {
    public void run(){
        Beverage beverage1 = new Milk(new Mocha(new Whip(new DarkRoast())));

        System.out.println("Description: " + beverage1.getDescription());
        System.out.println("Cost: " + beverage1.cost());
    }
}
