package org.pizza_store.domain;

import org.pizza_store.domain.ingredient.IngredientFactory;

public class ClamPizza extends Pizza {
    IngredientFactory ingredientFactory;

    public ClamPizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("preparing ClamPizza...");
        ingredientFactory.createDough();
        ingredientFactory.createClam();
    }
}
