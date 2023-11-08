package OpenClosePrinciple.notFollowed;

public class Main {
    public static void main(String[] args) {
        // Create a Marker object
        Marker marker = new Marker("ExampleMarker", "Red", 2023, 5);
        // Create an Invoice object with the Marker and quantities
        Invoice invoice = new Invoice(marker, 10);
        // Calculate the total price
        int totalPrice = invoice.calculateTotals();
        InvoiceDAO invoiceDAO = new InvoiceDAO(invoice);
        invoiceDAO.saveInFile();
        invoiceDAO.saveInDB();
        System.out.println("Total Price: " + totalPrice);
    }
}
