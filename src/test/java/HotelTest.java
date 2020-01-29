import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private Conference conference1;
    private Conference conference2;
    private Conference conference3;

    @Before
    public void before(){
        // Create empty conference arraylist, create rooms, put rooms in list
        ArrayList<Conference> conferenceRooms = new ArrayList<Conference>();
        conference1 = new Conference("Oak", 5);
        conference2 = new Conference("Pine", 8);
        conference3 = new Conference("Cedar", 10);
        conferenceRooms.add(conference1);
        conferenceRooms.add(conference2);
        conferenceRooms.add(conference3);

        // Create empty room arraylist , create rooms, put rooms in list
        ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
        bedroom1 = new Bedroom(1, 1, "Single");
        bedroom2 = new Bedroom(2, 2, "Double");
        bedroom3 = new Bedroom(4, 4, "Double");
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);

        hotel = new Hotel("Citizen M", conferenceRooms, bedrooms);
    }

    @Test
    public void conferenceArrayHasRooms(){
        assertEquals(3, hotel.conferenceRoomsInHotel());
    }

    @Test
    public void bedroomsArrayHasRooms(){
        assertEquals(3, hotel.bedroomsRoomsInHotel());
    }

    @Test
    public void checkInGuestConferenceHasCapacity(){
       Guest guest1 = new Guest("Bob");
       hotel.checkInGuestConference(guest1,conference1);
       assertEquals(1, conference1.checkGuestsInRoom());

    }

    @Test
    public void checkInGuestConferenceNotGotCapacity(){
        Guest guest1 = new Guest("Bob");
        conference1.addGuest(guest1);
        conference1.addGuest(guest1);
        conference1.addGuest(guest1);
        conference1.addGuest(guest1);
        conference1.addGuest(guest1);
        hotel.checkInGuestConference(guest1,conference1);
        assertEquals(5, conference1.checkGuestsInRoom());
    }

    @Test
    public void checkRemoveGuestConference(){
        Guest guest = new Guest("Bob");
        conference1.addGuest(guest);
        conference1.addGuest(guest);
        conference1.addGuest(guest);
        conference1.addGuest(guest);
        conference1.addGuest(guest);
        hotel.checkOutGuestConference(guest, conference1);
        assertEquals(4, conference1.checkGuestsInRoom());
    }

    @Test
    public void checkInGuestBedroomNotGotCapacity(){
        Guest guest1 = new Guest("Bob");
        bedroom3.addGuest(guest1);
        bedroom3.addGuest(guest1);
        bedroom3.addGuest(guest1);
        bedroom3.addGuest(guest1);
        hotel.checkInGuestBedroom(guest1, bedroom3);
        assertEquals(4,bedroom3.checkGuestsInRoom());
    }

    @Test
    public void checkInGuestBedroomHasCapacity(){
        Guest guest1 = new Guest("Bob");
        bedroom3.addGuest(guest1);
        bedroom3.addGuest(guest1);
        bedroom3.addGuest(guest1);
        hotel.checkInGuestBedroom(guest1, bedroom3);
        assertEquals(4, bedroom3.checkGuestsInRoom());
    }

    @Test
    public void checkRemoveGuestBedroom(){
        Guest guest = new Guest("Bob");
        bedroom1.addGuest(guest);
        hotel.checkOutGuestBedroom(guest, bedroom1);
        assertEquals(0, bedroom1.checkGuestsInRoom());
    }

    @Test
    public void checkRemoveGuestAbsent(){
        Guest guest1 = new Guest("Bob");
        Guest guest2 = new Guest("Jill");
        conference1.addGuest(guest1);
        hotel.checkOutGuestConference(guest2, conference1);
        assertEquals(1, conference1.checkGuestsInRoom());
    }

    @Test
    public void checkRemoveGuestBedroomAbsent(){
        Guest guest = new Guest("Bob");
        Guest guest2 = new Guest("Jill");
        bedroom1.addGuest(guest);
        hotel.checkOutGuestBedroom(guest2, bedroom1);
        assertEquals(1, bedroom1.checkGuestsInRoom());
    }

    @Test
    public void canBookRoom(){
        Booking booking = new Booking(bedroom1,1);
        assertEquals(bedroom1, booking.getBedroom());
        assertEquals(1, booking.getNights());
    }



}
