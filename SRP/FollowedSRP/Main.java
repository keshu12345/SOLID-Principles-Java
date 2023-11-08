package SRP.FollowedSRP;



public class Main {


    public static void  main(String[]args) {
        // Create a Marker object
        Marker marker = new Marker("ExampleMarker", "Red", 2023, 5);

        // Create an Invoice object with the Marker and quantities
        Invoice invoice = new Invoice(marker, 10);

        // Calculate the total price
        int totalPrice = invoice.calculateTotals();
        PrintInvoice printInvoice = new PrintInvoice(invoice);
        printInvoice.printInvoice();
        SaveInDB saveInDB=new SaveInDB(invoice);
        saveInDB.saveInDB();
        System.out.println("Total Price: " + totalPrice);
    }

}
