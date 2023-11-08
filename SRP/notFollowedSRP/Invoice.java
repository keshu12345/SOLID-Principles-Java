package SRP.notFollowedSRP;

public class Invoice {
    private  Marker marker;
    private int quantities;
    public Invoice(Marker marker,int quantities){
        this.marker=marker;
        this.quantities=quantities;
    }
    public int calculateTotals(){
        int price=((marker.price)*quantities);
        return  price;
    }
    public void printInvoice(){
        System.out.println("invoice is printed price is ::"+marker.price);
    }

    public void saveInDB(){
        System.out.println("Saved in DB is ::"+quantities+" price::"+marker.price);
    }
}
