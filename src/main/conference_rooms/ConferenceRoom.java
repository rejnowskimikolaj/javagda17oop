package main.conference_rooms;

public class ConferenceRoom {

    private int number;
    private boolean isFree;
    private int seats;
    private double price;

    public ConferenceRoom(int number, int seats, double price) {
        this.number = number;
        this.seats = seats;
        this.price = price;
        this.isFree = true;
    }

    public ConferenceRoom(int number, int seats, double price, boolean isFree) {
        this.number = number;
        this.isFree = isFree;
        this.seats = seats;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public boolean isFree() {
        return isFree;
    }

    public int getSeats() {
        return seats;
    }

    public double getPrice() {
        return price;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return "ConferenceRoom{" +
                "number=" + number +
                ", isFree=" + isFree +
                ", seats=" + seats +
                ", price=" + price +
                '}';
    }
}
