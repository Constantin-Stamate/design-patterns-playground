package com.playground.resources.principles.solid.dip.violation;

public class EmailNotifier {

    public void send(String message) {
        System.out.println("Send EMAIL: " + message);
    }
}