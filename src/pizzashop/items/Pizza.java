package pizzashop.items;

import pizzashop.ingredients.RegularBase;
import pizzashop.ingredients.Base;
import pizzashop.ingredients.Ingredient;
import pizzashop.ingredients.Size;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements OrderItem {
    private List<Ingredient> ingredientList = new ArrayList<>();
    private Base base = new RegularBase();
    private Size size = Size.REGULAR;

    public Pizza() {

    }

    public void setSize(Size size) {
        if (size == null) {
            return;
        }
        this.size = size;
    }

    public void setBase(Base base) {
        if (base == null) {
            return;
        }
        this.base = base;
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredient == null) {
            return;
        }
        this.ingredientList.add(ingredient);
    }

    @Override
    public double calculatePrice() {

        double totalIngredients = this.ingredientList.stream().mapToDouble(Ingredient::price).sum();
        double basePrice = this.base.price() * size.getMultiplier();

        return basePrice + totalIngredients;
    }
}
