package OpenClosePrinciple.followed;

public class FileInvoiceDAO implements InvoiceDAO{
    @Override
    public void save(Invoice invoice) {
        System.out.println("Saved in File is ::"+invoice.quantities+" price::"+invoice.marker.price);
    }
}
