package InterfaceSegregationPrinciple.followed;

public class Chef implements ChefI{
    @Override
    public void cookFood() {
        System.out.println("Chef is coking food");
    }

    @Override
    public void decideMenu() {
        System.out.println("Chef is decided MenuCard");

    }
}
