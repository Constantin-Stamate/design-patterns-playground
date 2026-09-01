package com.playground.resources.principles.solid.dip.compliant;

public class DependencyInversionPrincipleCompliantDemo {

    public static void main(String[] args) {
        Notifier notifier = new SmsNotifier();
        OrderProcessor processor = new OrderProcessor(notifier);

        processor.process();
    }
}