import java.util.ArrayList;

public class Bedroom {

    private int number;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;
    private int rate;

    public Bedroom(Integer number, Integer capacity, String type, Integer rate) {
        this.number = number;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
        this.rate = rate;
    }

    public int checkGuestsInRoom(){
        return this.guests.size();
    }

    public int getNumber() {
        return number;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public int getRate() {
        return rate;
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
