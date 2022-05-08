package com.aprakhov.self.study;

public class Main {
    public static void main(String[] args) {
        final CoronaDesinfector coronaDesinfector = new CoronaDesinfector();
        coronaDesinfector.start(new Room());
    }
}