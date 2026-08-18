package Food.Service;
import Food.Main.FoodOrder;

public class PremiumOrder extends FoodOrder implements Discountable {
    private static final double deliveryCharge=50;
    private static final double discount=0.15;

    public PremiumOrder(int orderId, String customerName, double amount){
        super(orderId, customerName, amount);
    }

    @Override
    protected double calculateDeliveryCharges() {
        return deliveryCharge;
    }

    @Override
    public double applyDiscount() {
        return getAmount*discount;
    }

    public void displayOrderDetails(){
        super.displayOrderDetials();
        System.out.println("Order Type: Premium");
    }
}
