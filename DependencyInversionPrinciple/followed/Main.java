package DependencyInversionPrinciple.followed;

public class Main {
    public static void main(String[] args) {
        // Create instances of different keyboards and mice
        KeyboardI bluetoothKeyboard = new BluetoothKeyboard();
        MouseI bluetoothMouse = new BluetoothMouse();

        KeyboardI wiredKeyboard = new WiredKeyboard();
        MouseI wiredMouse = new WiredMouse();

        // Create instances of MackBook using different keyboards and mice
        MackBook mackBookWithBluetooth = new MackBook(bluetoothKeyboard, bluetoothMouse);
        MackBook mackBookWithWired = new MackBook(wiredKeyboard, wiredMouse);

        // Use the MackBooks
        useMackBook(mackBookWithBluetooth);
        useMackBook(mackBookWithWired);
    }

    public static void useMackBook(MackBook mackBook) {
        System.out.println("Using MackBook with:");
        mackBook.keyboardI.canType();
        mackBook.keyboardI.writeFasterWiredOrBluetooth();
        mackBook.keyboardI.easyToUseWiredOrBlueTooth();
        mackBook.mouseI.cursor();
        System.out.println("--------------");
    }
}