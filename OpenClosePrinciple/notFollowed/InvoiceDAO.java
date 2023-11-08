package OpenClosePrinciple.notFollowed;

public class InvoiceDAO {
    Invoice invoice;
    public InvoiceDAO(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveInDB(){
        System.out.println("Saved in DB is ::"+invoice.quantities+" price::"+invoice.marker.price);
    }

    // This feature comes after production code deployment then changes in exiting code
    // it is very difficult fixed the problem there would be possibility broke the existing code
    //Then better to use Open close Principle
    public void saveInFile(){
        System.out.println("Saved in File is ::"+invoice.quantities+" price::"+invoice.marker.price);
    }
}
