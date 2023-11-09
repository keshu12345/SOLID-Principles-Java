package DependencyInversionPrinciple.followed;

public class BluetoothMouse implements MouseI {
    @Override
    public void cursor() {
        System.out.println("BluetoothMouse cursor is slow");
    }
}
