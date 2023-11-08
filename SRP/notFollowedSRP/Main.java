package SRP.notFollowedSRP;

public class Main {
    public static void main(String[] args) {
        // Create a Marker object
        Marker marker = new Marker("ExampleMarker", "Red", 2023, 5);

        // Create an Invoice object with the Marker and quantities
        Invoice invoice = new Invoice(marker, 10);

        // Calculate the total price
        int totalPrice = invoice.calculateTotals();

        // Print the invoice
        invoice.printInvoice();

        // Save the invoice in the database
        invoice.saveInDB();

        // Print the details of the Marker
        System.out.println("Marker Details:");
        System.out.println("Name: " + marker.name);
        System.out.println("Color: " + marker.color);
        System.out.println("Year: " + marker.year);
        System.out.println("Price: " + marker.price);

        // Print the total price from the Invoice
        System.out.println("Total Price: " + totalPrice);
    }
}
