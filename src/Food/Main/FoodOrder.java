package Food.Main;

public abstract class FoodOrder {
    int orderId;
    String customerName;
    double amount;
    static String restaurantName;

    public FoodOrder(int id, String name, double amt, String rName){
        orderId=id;
        customerName=name;
        amount=amt;
        restaurantName=rName;
    }
    protected abstract double calculateDeliveryCharges();
}