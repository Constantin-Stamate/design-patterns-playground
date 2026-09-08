package com.playground.resources.designpatterns.creational.factorymethod.implementation;

public class PaypalPaymentProcessor implements PaymentProcessor {

    @Override
    public void process(double amount) {
        System.out.println("PayPal processing payment: " + amount);
    }
}