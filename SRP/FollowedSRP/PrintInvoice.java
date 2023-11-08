package SRP.FollowedSRP;

public class PrintInvoice {
    private Invoice invoice;

    public PrintInvoice(Invoice invoice){
        this.invoice=invoice;
    }
    public void printInvoice(){
        System.out.println("invoice is printed price is ::"+invoice.marker.price);
    }

}
