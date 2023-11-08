package OpenClosePrinciple.followed;

public class Main {
    public static void main(String[] args) {
        // Create a marker and an invoice
        Marker marker = new Marker("Marker A", "Red", 2023, 5);
        Invoice invoice = new Invoice(marker, 10);

        // Create instances of DAO implementations
        InvoiceDAO fileInvoiceDAO = new FileInvoiceDAO();
        InvoiceDAO databaseInvoiceDAO = new DatabaseInvoiceDAO();

        // Save the invoice using FileInvoiceDAO
        fileInvoiceDAO.save(invoice);

        // Save the invoice using DatabaseInvoiceDAO
        databaseInvoiceDAO.save(invoice);

        // Calculate and print the total price
        int totalPrice = invoice.calculateTotals();
        System.out.println("Total Price: " + totalPrice);
    }
}