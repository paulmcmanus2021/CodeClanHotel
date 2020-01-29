import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Test
    public void canGetName()
    {
        guest = new Guest("Billy Bragg");
        assertEquals("Billy Bragg", guest.getName());
    }
}
