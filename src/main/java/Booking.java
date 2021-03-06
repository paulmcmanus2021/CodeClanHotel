public class Booking {

    private Bedroom bedroom;
    private int nights;

    public Booking(Bedroom bedroom, int nights) {
        this.bedroom = bedroom;
        this.nights = nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNights() {
        return nights;
    }

    public int totalBill(){
        int nights = getNights();
        int rate = bedroom.getRate();
        return nights * rate;
    }
}
