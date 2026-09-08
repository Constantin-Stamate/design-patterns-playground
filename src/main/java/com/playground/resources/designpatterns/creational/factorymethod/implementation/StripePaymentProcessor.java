package com.playground.resources.designpatterns.creational.factorymethod.implementation;

public class StripePaymentProcessor implements PaymentProcessor {

    @Override
    public void process(double amount) {
        System.out.println("Stripe processing payment: " + amount);
    }
}