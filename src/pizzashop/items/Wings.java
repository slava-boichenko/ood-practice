package pizzashop.items;

public class Wings implements OrderItem{
    @Override
    public double calculatePrice() {
        return 10;
    }
}
