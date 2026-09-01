package com.playground.resources.principles.solid.dip.compliant;

public class SmsNotifier implements Notifier {

    @Override
    public void notify(String message) {
        System.out.println("Send SMS: " + message);
    }
}