package com.playground.resources.designpatterns.creational.factorymethod.implementation;

public class StripePaymentService extends PaymentService {

    @Override
    protected PaymentProcessor createProcessor() {
        return new StripePaymentProcessor();
    }
}