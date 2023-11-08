package OpenClosePrinciple.followed;

public class DatabaseInvoiceDAO implements InvoiceDAO{
    @Override
    public void save(Invoice invoice) {
        System.out.println("Saved in DB is ::"+invoice.quantities+" price::"+invoice.marker.price);
    }
}
