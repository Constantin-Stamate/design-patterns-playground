package com.playground.resources.designpatterns.creational.factorymethod.implementation;

public abstract class PaymentService {

    protected abstract PaymentProcessor createProcessor();

    public void pay(double amount) {
        PaymentProcessor processor = createProcessor();

        processor.process(amount);

        System.out.println("Payment execution completed");
    }
}