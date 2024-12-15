package org.pizza_store.domain.ingredient;

import org.pizza_store.domain.ingredient.cheese.Cheese;
import org.pizza_store.domain.ingredient.cheese.MozzarellaCheese;
import org.pizza_store.domain.ingredient.clam.Clam;
import org.pizza_store.domain.ingredient.clam.FreshClam;
import org.pizza_store.domain.ingredient.dough.Dough;
import org.pizza_store.domain.ingredient.dough.ThinCrustDough;

public class ChicagoPizzaIngredientFactory implements IngredientFactory{
    Dough dough;
    Cheese cheese;
    Clam clam;

    public void createDough(){
        dough = new ThinCrustDough();
        dough.createDough();
    }

    public void createCheese(){
        cheese = new MozzarellaCheese();
        cheese.createCheese();
    }

    public void createClam(){
        clam = new FreshClam();
        clam.createClam();
    }
}
