package org.pizza_store.domain;

import org.pizza_store.domain.ingredient.cheese.Cheese;
import org.pizza_store.domain.ingredient.clam.Clam;
import org.pizza_store.domain.ingredient.dough.Dough;

public class Pizza {
    Dough dough;
    Clam clam;
    Cheese cheese;
    public void prepare() {
    }

    public void bake() {
        System.out.println("baking...");
    }

    public void cut() {
        System.out.println("cutting...");
    }

    public void box() {
        System.out.println("boxing...");
    }
}
