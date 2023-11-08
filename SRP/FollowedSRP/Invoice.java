package SRP.FollowedSRP;


public class Invoice {
    Marker marker;
    int quantities;
    public Invoice(Marker marker, int quantities){
        this.marker=marker;
        this.quantities=quantities;
    }
    public int calculateTotals(){
        int price=((marker.price)*quantities);
        return  price;
    }
}
