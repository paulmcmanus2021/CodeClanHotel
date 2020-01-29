import org.junit.Before;

public class BookingTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Booking booking1;
    private Booking booking2;
    private Booking booking3;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, 1, "Single");
        bedroom2 = new Bedroom(2, 2, "Double");
        bedroom3 = new Bedroom(4, 4, "Double");
        booking1 = new Booking(bedroom1, 1);
        booking2 = new Booking(bedroom2, 2);
        booking3 = new Booking(bedroom3, 3);
    }
}
