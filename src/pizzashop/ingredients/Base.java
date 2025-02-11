package pizzashop.ingredients;

public interface Base extends Ingredient {
    public static double DEFAULT_PRICE = 10.0;

    default public double price() {
        return DEFAULT_PRICE;
    }
}
