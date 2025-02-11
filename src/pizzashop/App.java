package pizzashop;

import pizzashop.ingredients.Cheese;
import pizzashop.ingredients.Ham;
import pizzashop.items.Pizza;
import pizzashop.items.Wings;
import pizzashop.builder.PizzaBuilder;
import pizzashop.payment.BOGOCoupon;
import pizzashop.payment.PercentageDiscount;

public class App {
    public static void main(String[] args) {
        Order order = new Order();

        Pizza pizza1 = new PizzaBuilder().withIngredient(new Cheese()).build();
        Pizza pizza2 = new PizzaBuilder().withIngredient(new Ham()).build();
        Wings wings = new Wings();

        order.addItem(pizza1);
        order.addItem(pizza2);
        order.addItem(wings);

        order.addDiscount(new PercentageDiscount(10));
        order.addDiscount(new BOGOCoupon());

        System.out.println("Total " + order.total());
    }

}
