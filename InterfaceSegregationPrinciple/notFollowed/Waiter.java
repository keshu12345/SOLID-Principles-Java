package InterfaceSegregationPrinciple.notFollowed;

public class Waiter implements RestaurantEmployee{

    // this is not work Waiter it is unnecessary force to implement
    @Override
    public void washDish() {
        // not my job
        System.out.println("Wash utensils");
    }

    @Override
    public void serveCustomer() {
        // Yes here is my job
        System.out.println("Serving to customer");
    }

    @Override
    public void cookFood() {
        //  this is not my job
        System.out.println("cooking food");
    }
}
