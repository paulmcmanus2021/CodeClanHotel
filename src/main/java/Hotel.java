import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Conference> conferenceRooms;
    private ArrayList<Bedroom> bedrooms;

    public Hotel(String name, ArrayList<Conference> conferenceRooms, ArrayList<Bedroom> bedrooms) {
        this.name = name;
        this.conferenceRooms = conferenceRooms;
        this.bedrooms = bedrooms;
    }

    public int conferenceRoomsInHotel() {
       return this.conferenceRooms.size();
    }

    public int bedroomsRoomsInHotel() {
        return this.bedrooms.size();
    }

    public void checkInGuestConference(Guest guest, Conference conference) {
        if(conference.hasCapacity()){
        conference.addGuest(guest);}
    }

    public void checkOutGuestConference(Guest guest, Conference conference) {
        conference.removeGuest(guest);
    }

    public void checkInGuestBedroom(Guest guest, Bedroom bedroom) {
        if(bedroom.hasCapacity()){
            bedroom.addGuest(guest);}
    }

    public void checkOutGuestBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }
}
