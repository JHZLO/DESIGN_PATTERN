package org.pizza_store.factory;

import org.pizza_store.domain.CheesePizza;
import org.pizza_store.domain.ClamPizza;
import org.pizza_store.domain.Pizza;
import org.pizza_store.domain.ingredient.IngredientFactory;
import org.pizza_store.domain.ingredient.NyPizzaIngredientFactory;

public class NyPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        IngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        }
        if (type.equals("Clam")) {
            pizza = new ClamPizza(ingredientFactory);
        }
        return pizza;
    }
}
