package org.example;

public class Controller {
    public void run() {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();

        chocolateBoiler.fill();
        chocolateBoiler1.fill();

        chocolateBoiler.boil();
        chocolateBoiler1.boil();
    }
}
