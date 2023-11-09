package InterfaceSegregationPrinciple.notFollowed;

public class Chef implements RestaurantEmployee{
    @Override
    public void washDish() {
        // this is not my job
    }

    @Override
    public void serveCustomer() {
        // this is not my job

    }

    @Override
    public void cookFood() {
        // yes this is my job
        System.out.println("Cooking the food");

    }
}
