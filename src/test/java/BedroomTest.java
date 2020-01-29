import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;

    @Before
    public void before(){

        bedroom1 = new Bedroom(1, 1, "Single");
        bedroom2 = new Bedroom(2, 2, "Double");
        bedroom3 = new Bedroom(4, 4, "Double");
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

}
