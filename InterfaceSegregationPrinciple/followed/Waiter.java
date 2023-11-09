package InterfaceSegregationPrinciple.followed;

public class Waiter implements WaiterI{
    @Override
    public void serverCustomer() {
        System.out.println("Waiter is serving");
    }

    @Override
    public void takeOrder() {
        System.out.println("Waiter is taking order");

    }
}
