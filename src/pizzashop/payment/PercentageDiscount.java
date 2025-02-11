package pizzashop.payment;

import pizzashop.Order;

public class PercentageDiscount implements Discount{

    private int discountPercent;

    public PercentageDiscount(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateAdjustment(Order order) {
        return order.total() * discountPercent;
    }
}
