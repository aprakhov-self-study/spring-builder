package com.aprakhov.self.study;

public class ConsoleAnnounser implements Announcer {
    @Override
    public void announce(String announcement) {
        System.out.println(announcement);
    }
}
