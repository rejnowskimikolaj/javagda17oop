package main.conference_rooms;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ConferenceCenter {

    private List<ConferenceRoom> conferenceRooms = new ArrayList<>();

    public ConferenceCenter(List<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public ConferenceCenter() {
    }

    public boolean addRoom(ConferenceRoom room) {
        for (ConferenceRoom conferenceRoom : conferenceRooms) {

            if (conferenceRoom.getNumber() == room.getNumber()) {
                return false;
            }
        }

        conferenceRooms.add(room);
        return true;
    }

    public void printRooms() {
        System.out.println(conferenceRooms);
    }


    public Optional<ConferenceRoom> getTheCheapest(int seatsNeeded) {

        List<ConferenceRoom> correctRooms = getRoomsWithEnoughSeats(conferenceRooms, seatsNeeded);


        if (correctRooms.size() > 0) {
            ConferenceRoom cheapest = correctRooms.get(0);

            for (ConferenceRoom conferenceRoom : conferenceRooms) {

                if (conferenceRoom.getPrice() < cheapest.getPrice()) {
                    cheapest = conferenceRoom;
                }
            }
            return Optional.of(cheapest);
        } else {
            return Optional.empty();
        }
    }

    private List<ConferenceRoom> getRoomsWithEnoughSeats(List<ConferenceRoom> rooms, int seats) {
        List<ConferenceRoom> result = new ArrayList<>();
        for (ConferenceRoom room : rooms) {
            if (room.getSeats() >= seats) result.add(room);
        }
        return result;
    }

    /*
    3 - znajdzNajtanszaSale():SalaKonferencyjna -
    metoda która szuka sali która jest najtansza i nie jest zajeta.
     */

    public Optional<ConferenceRoom> getTheCheapestFree() {
        if (conferenceRooms.size() > 0) {

            List<ConferenceRoom> freeRooms = new ArrayList<>();
            for (ConferenceRoom conferenceRoom : conferenceRooms) {
                if(conferenceRoom.isFree())freeRooms.add(conferenceRoom);
            }
            if(freeRooms.isEmpty())return Optional.empty();
            ConferenceRoom cheapest = freeRooms.get(0);

            for (ConferenceRoom conferenceRoom : conferenceRooms) {

                if (conferenceRoom.getPrice() < cheapest.getPrice() ) {
                    cheapest = conferenceRoom;
                }
            }
            return Optional.of(cheapest);
        } else {
            return Optional.empty();
        }
    }
}
