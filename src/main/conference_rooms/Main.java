package main.conference_rooms;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        ConferenceRoom conferenceRoom1 = new ConferenceRoom(1,13,90.0);
        ConferenceRoom conferenceRoom2 = new ConferenceRoom(2,10,50.0);
        ConferenceRoom conferenceRoom3 = new ConferenceRoom(3,12,40.0,false);
        ConferenceRoom conferenceRoom4 = new ConferenceRoom(4,15,70.0);

        ConferenceCenter conferenceCenter = new ConferenceCenter();
        conferenceCenter.addRoom(conferenceRoom1);
        conferenceCenter.addRoom(conferenceRoom2);
        conferenceCenter.addRoom(conferenceRoom3);
        conferenceCenter.addRoom(conferenceRoom4);

        conferenceCenter.printRooms();

        System.out.println(conferenceCenter.addRoom(conferenceRoom1));

        Optional<ConferenceRoom> roomOptional = conferenceCenter.getTheCheapest(20);
        System.out.println(roomOptional);
        System.out.println(conferenceCenter.getTheCheapestFree());
    }
}
