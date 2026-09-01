package com.playground.resources.principles.solid.dip.violation;

public class OrderProcessor {

    private final EmailNotifier notifier;

    public OrderProcessor() {
        this.notifier = new EmailNotifier();
    }

    public void process() {
        System.out.println("Processing order...");
        notifier.send("Order processed!");
    }
}