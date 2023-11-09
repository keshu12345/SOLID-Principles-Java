package DependencyInversionPrinciple.followed;

public class WiredKeyboard implements KeyboardI{
    @Override
    public void canType() {
        System.out.println("We can type in wiredKeyboard");
    }

    @Override
    public void writeFasterWiredOrBluetooth() {
        System.out.println("WiredKeyboard is faster to write");

    }

    @Override
    public void easyToUseWiredOrBlueTooth() {
        System.out.println("WiredKeyboard is not easy to use");

    }
}
