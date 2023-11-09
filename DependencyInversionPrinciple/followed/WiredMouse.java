package DependencyInversionPrinciple.followed;

public class WiredMouse implements MouseI{
    @Override
    public void cursor() {
        System.out.println("WiredMouse cursor is fast");
    }
}
