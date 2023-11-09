package DependencyInversionPrinciple.followed;

public class BluetoothKeyboard implements KeyboardI{
    @Override
    public void canType() {
        System.out.println("We can type in BluetoothKeyboard");
    }

    @Override
    public void writeFasterWiredOrBluetooth() {
        System.out.println("BluetoothKeyboard is lack in writing");

    }

    @Override
    public void easyToUseWiredOrBlueTooth() {
        System.out.println("BluetoothKeyboard is easy to use");

    }
}
