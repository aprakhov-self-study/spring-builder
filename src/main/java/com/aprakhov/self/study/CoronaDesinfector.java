package com.aprakhov.self.study;

public class CoronaDesinfector {

    Announcer announcer = new ConsoleAnnounser();
    Policeman policeman = new PolicemanImpl();

    public void start(Room room) {
        announcer.announce("Please go away!");
        policeman.makePeopleGoAway();
        desinfect(room);
    }

    private void desinfect(Room room) {
        System.out.println("Desinfecting the room..");
    }
}
