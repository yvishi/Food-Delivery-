package Food.Service;
import Food.Main.FoodOrder;

public class RegularOrder extends FoodOrder implements Discountable {

    private static final int deliveryCharge=50;
    private static final double discount=0.15;

    public RegularOrder(int id, String name, double amt, String rName){
        super(id, name, amt, rName);
    }

    protected double calculateDeliveryCharges() {
        return deliveryCharge;
    }

    @Override
    public double applyDiscount(){
        return getAmount()*discount;
    }

    public void displayOrderDetails(){
        super.displayOrderDetails();
        System.out.print("Order Type: Regular");
    }
}
