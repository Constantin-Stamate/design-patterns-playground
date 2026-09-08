package com.playground.resources.designpatterns.creational.factorymethod.implementation;

public class PaypalPaymentService extends PaymentService {

    @Override
    protected PaymentProcessor createProcessor() {
        return new PaypalPaymentProcessor();
    }
}