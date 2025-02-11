package pizzashop.payment;

import pizzashop.Order;

public class BOGOCoupon implements Discount {

    @Override
    public double calculateAdjustment(Order order) {
        double adjustment = 0;
        // Figure out a good way to apply this coupon
        return adjustment;
    }
}
