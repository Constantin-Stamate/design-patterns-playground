package com.playground.resources.designpatterns.creational.abstractfactory.implementation;

public class StripeFactory implements PaymentFactory {

    @Override
    public Payment createPayment() {
        return new StripePayment();
    }

    @Override
    public Receipt createReceipt() {
        return new StripeReceipt();
    }
}