package com.playground.resources.principles.solid.dip.compliant;

public class OrderProcessor {

    private final Notifier notifier;

    public OrderProcessor(Notifier notifier) {
        this.notifier = notifier;
    }

    public void process() {
        System.out.println("Processing order...");
        notifier.notify("Order processed");
    }
}