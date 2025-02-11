package pizzashop.builder;

import pizzashop.ingredients.Base;
import pizzashop.ingredients.Ingredient;
import pizzashop.ingredients.Size;
import pizzashop.items.Pizza;

public class PizzaBuilder {
    private Pizza pizzaOrder = new Pizza();

    public PizzaBuilder(){

    }

    public PizzaBuilder withBase(Base base) {
        this.pizzaOrder.setBase(base);
        return this;
    }

    public PizzaBuilder withSize(Size size) {
        this.pizzaOrder.setSize(size);
        return this;
    }

    public PizzaBuilder withIngredient(Ingredient ingredient) {
        this.pizzaOrder.addIngredient(ingredient);
        return this;
    }

    public Pizza build() {
        return this.pizzaOrder;
    }

}
