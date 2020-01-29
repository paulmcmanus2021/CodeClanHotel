import java.util.ArrayList;

public class Conference {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public Conference(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int checkGuestsInRoom() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }

    public boolean hasCapacity() {
        return capacity > checkGuestsInRoom();
    }
}
