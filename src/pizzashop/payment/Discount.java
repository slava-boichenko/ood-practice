package pizzashop.payment;

import pizzashop.Order;

public interface Discount {
    double calculateAdjustment(Order order);
}
