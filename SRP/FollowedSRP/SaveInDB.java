package SRP.FollowedSRP;

public class SaveInDB {
    Invoice invoice;
    public SaveInDB(Invoice invoice){
        this.invoice=invoice;
    }
    public void saveInDB(){
        System.out.println("Saved in DB is ::"+invoice.quantities+" price::"+invoice.marker.price);
    }
}
