package org.pizza_store.domain.ingredient;

import org.pizza_store.domain.ingredient.cheese.Cheese;
import org.pizza_store.domain.ingredient.cheese.MozzarellaCheese;
import org.pizza_store.domain.ingredient.cheese.ReggianoCheese;
import org.pizza_store.domain.ingredient.clam.Clam;
import org.pizza_store.domain.ingredient.clam.FreshClam;
import org.pizza_store.domain.ingredient.clam.FrozenClam;
import org.pizza_store.domain.ingredient.dough.Dough;
import org.pizza_store.domain.ingredient.dough.ThickCrustDough;
import org.pizza_store.domain.ingredient.dough.ThinCrustDough;

public class NyPizzaIngredientFactory implements IngredientFactory{
    Dough dough;
    Cheese cheese;
    Clam clam;

    public void createDough(){
        dough = new ThickCrustDough();
        dough.createDough();
    }

    public void createCheese(){
        cheese = new ReggianoCheese();
        cheese.createCheese();
    }

    public void createClam(){
        clam = new FrozenClam();
        clam.createClam();
    }
}
