package InterfaceSegregationPrinciple.notFollowed;

public class Main {

    public static void main(String[]args) {
        RestaurantEmployee restaurantEmployee = new Waiter();
        restaurantEmployee.cookFood();
        restaurantEmployee.serveCustomer();
        restaurantEmployee.washDish();
        restaurantEmployee=new Chef();
        restaurantEmployee.cookFood();
        restaurantEmployee.serveCustomer();
        restaurantEmployee.washDish();

    }

}
