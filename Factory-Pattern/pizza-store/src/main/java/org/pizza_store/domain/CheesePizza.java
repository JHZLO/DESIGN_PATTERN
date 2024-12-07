package org.pizza_store.domain;

import org.pizza_store.domain.ingredient.IngredientFactory;

public class CheesePizza extends Pizza {
    IngredientFactory ingredientFactory;

    public CheesePizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("preparing CheesePizza...");
        ingredientFactory.createCheese();
        ingredientFactory.createDough();
    }
}
