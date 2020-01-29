import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;

    @Before
    public void before(){

        bedroom1 = new Bedroom(1, 1, "Single", 5);
        bedroom2 = new Bedroom(2, 2, "Double", 10);
        bedroom3 = new Bedroom(4, 4, "Double", 15);
    }

    @Test
    public void guestsArrayStartsEmpty(){
        assertEquals(0, bedroom1.checkGuestsInRoom());
    }

    @Test
    public void hasANumber(){
        assertEquals(1, bedroom1.getNumber());
    }

    @Test
    public void hasACapacity(){
        assertEquals(1, bedroom1.getCapacity());
    }

    @Test
    public void hasAType(){
        assertEquals("Single", bedroom1.getType());
    }

    @Test
    public void canAddGuestToBedroom (){
        Guest guest = new Guest("Bob");
        bedroom1.addGuest(guest);
        assertEquals(1, bedroom1.checkGuestsInRoom());
    }

    @Test
    public void canRemoveGuestFromBedroom(){
        Guest guest = new Guest("Bob");
        bedroom1.addGuest(guest);
        bedroom1.removeGuest(guest);
        assertEquals(0, bedroom1.checkGuestsInRoom());
    }

    @Test
    public void checkCapacityNotFull(){
        assertEquals(true, bedroom1.hasCapacity());
    }

    @Test
    public void checkCapacityFull(){
        Guest guest = new Guest("Bob");
        bedroom1.addGuest(guest);
        bedroom1.addGuest(guest);
        bedroom1.addGuest(guest);
        bedroom1.addGuest(guest);
        bedroom1.addGuest(guest);
        assertEquals(false, bedroom1.hasCapacity());
    }
}
