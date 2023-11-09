package InterfaceSegregationPrinciple.followed;

public class Client {
    public static void main(String[]args){
        ChefI chefI=new Chef();
        chefI.cookFood();
        chefI.decideMenu();
        WaiterI waiterI=new Waiter();
        waiterI.serverCustomer();
        waiterI.takeOrder();
    }
}
