package pizzashop;

import pizzashop.items.OrderItem;
import pizzashop.payment.Discount;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<OrderItem> items = new ArrayList<>();
    List<Discount> discounts = new ArrayList<>();

    public void addItem(OrderItem item) {
        this.items.add((item));
    }

    public List<OrderItem> getItems() {
        return this.items;
    }

    public void addDiscount(Discount discount) {
        this.discounts.add(discount);
    }

    public double total() {
        double total = this.items.stream().mapToDouble(OrderItem::calculatePrice).sum();

        for (Discount discount : this.discounts) {
            total -= discount.calculateAdjustment(this);
        }

        return total;
    }

}
