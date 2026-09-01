package com.playground.resources.principles.solid.dip.compliant;

public class EmailNotifier implements Notifier {

    @Override
    public void notify(String message) {
        System.out.println("Send EMAIL: " + message);
    }
}