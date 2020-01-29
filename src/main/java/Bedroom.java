import java.util.ArrayList;

public class Bedroom {

    private int number;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(Integer number, Integer capacity, String type) {
        this.number = number;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
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
}
