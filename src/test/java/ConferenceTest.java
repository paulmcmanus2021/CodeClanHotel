import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    private Conference conference1;
    private Conference conference2;
    private Conference conference3;

    @Before
    public void before(){
        conference1 = new Conference("Oak", 5);
        conference2 = new Conference("Pine", 8);
        conference3 = new Conference("Cedar", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Oak", conference1.getName());
    }
    @Test
    public void hasCapacity(){
        assertEquals(5, conference1.getCapacity());
    }

    @Test
    public void guestArrayStartsEmpty(){
        assertEquals(0, conference1.checkGuestsInRoom());
    }

}
